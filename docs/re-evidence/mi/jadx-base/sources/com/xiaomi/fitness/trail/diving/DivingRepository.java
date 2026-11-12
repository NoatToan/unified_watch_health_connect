package com.xiaomi.fitness.trail.diving;

import com.xiaomi.fitness.common.log.Logger;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/trail/diving/DivingRepository;", "", "<init>", "()V", "divingRequest", "Lcom/xiaomi/fitness/trail/diving/DivingRequest;", "getDivingRequest", "()Lcom/xiaomi/fitness/trail/diving/DivingRequest;", "setDivingRequest", "(Lcom/xiaomi/fitness/trail/diving/DivingRequest;)V", "getDivingPointDetailMap", "", "", "", "divingPointIdList", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDivingRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DivingRepository.kt\ncom/xiaomi/fitness/trail/diving/DivingRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1863#2,2:31\n*S KotlinDebug\n*F\n+ 1 DivingRepository.kt\ncom/xiaomi/fitness/trail/diving/DivingRepository\n*L\n21#1:31,2\n*E\n"})
public final class DivingRepository {

    @NotNull
    public static final String TAG = "DivingRepository";
    public DivingRequest divingRequest;

    /* JADX INFO: renamed from: com.xiaomi.fitness.trail.diving.DivingRepository$getDivingPointDetailMap$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.trail.diving.DivingRepository", f = "DivingRepository.kt", i = {0}, l = {19}, m = "getDivingPointDetailMap", n = {"map"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return DivingRepository.this.getDivingPointDetailMap(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getDivingPointDetailMap(@NotNull List<Integer> list, @NotNull Continuation<? super Map<Integer, String>> continuation) {
        AnonymousClass1 anonymousClass1;
        Exception e;
        Map map;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                DivingRequest divingRequest = getDivingRequest();
                anonymousClass1.L$0 = linkedHashMap;
                anonymousClass1.label = 1;
                Object divingPointDetailMap = divingRequest.getDivingPointDetailMap(list, anonymousClass1);
                if (divingPointDetailMap == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = divingPointDetailMap;
                map = linkedHashMap;
            } catch (Exception e2) {
                e = e2;
                map = linkedHashMap;
                Logger.i(TAG, "getDivingPointNameList failed. error=" + e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (Map) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                Logger.i(TAG, "getDivingPointNameList failed. error=" + e);
            }
        }
        for (DivePointItem divePointItem : ((GetDivingPointNameResult) obj).getDiveItem().getPointList()) {
            map.put(Boxing.boxInt(divePointItem.getId()), divePointItem.getName());
        }
        Logger.i(TAG, "getDivingPointNameList succeeded. result=" + map);
        return map;
    }

    @NotNull
    public final DivingRequest getDivingRequest() {
        DivingRequest divingRequest = this.divingRequest;
        if (divingRequest != null) {
            return divingRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("divingRequest");
        return null;
    }

    public final void setDivingRequest(@NotNull DivingRequest divingRequest) {
        Intrinsics.checkNotNullParameter(divingRequest, "<set-?>");
        this.divingRequest = divingRequest;
    }
}
