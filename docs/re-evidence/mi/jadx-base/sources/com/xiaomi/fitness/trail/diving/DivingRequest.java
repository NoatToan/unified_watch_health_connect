package com.xiaomi.fitness.trail.diving;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.extensions.HttpPoint;
import dagger.hilt.android.EntryPointAccessors;
import java.util.List;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0086@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/DivingRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/trail/diving/DivingService;", "<init>", "()V", "getDivingPointDetailMap", "Lcom/xiaomi/fitness/trail/diving/GetDivingPointNameResult;", "pointIds", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivingRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DivingRequest.kt\ncom/xiaomi/fitness/trail/diving/DivingRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n+ 3 HttpExtension.kt\ncom/xiaomi/fitness/net/extensions/HttpExtensionKt\n*L\n1#1,20:1\n141#2:21\n31#3:22\n28#3,2:23\n*S KotlinDebug\n*F\n+ 1 DivingRequest.kt\ncom/xiaomi/fitness/trail/diving/DivingRequest\n*L\n18#1:21\n18#1:22\n18#1:23,2\n*E\n"})
public final class DivingRequest extends BaseRequest<DivingService> {

    @NotNull
    public static final String TAG = "DivingRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.diving.DivingRequest$getDivingPointDetailMap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.diving.DivingRequest", f = "DivingRequest.kt", i = {}, l = {18}, m = "getDivingPointDetailMap", n = {}, s = {})
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
            return DivingRequest.this.getDivingPointDetailMap(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDivingPointDetailMap(@NotNull List<Integer> list, @NotNull Continuation<? super GetDivingPointNameResult> continuation) {
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
        Object commonInfo = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(commonInfo);
            String json = getMGson().toJson(new GetCommonInfoRequestParam(new GetCommonInfoRequestDiveItem(list)));
            Logger.i(TAG, "requestStr=" + json);
            DivingService mService = getMService();
            Intrinsics.checkNotNull(json);
            anonymousClass1.label = 1;
            commonInfo = mService.getCommonInfo(json, anonymousClass1);
            if (commonInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(commonInfo);
        }
        return ((HttpPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), HttpPoint.class)).getHttpConfig().getHttpResultHandler().handleResponse(commonInfo);
    }
}
