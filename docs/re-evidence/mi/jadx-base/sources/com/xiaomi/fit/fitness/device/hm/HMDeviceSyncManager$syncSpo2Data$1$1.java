package com.xiaomi.fit.fitness.device.hm;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.hm.health.bt.sdk.spo2.SpO2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncSpo2Data$1$1", f = "HMDeviceSyncManager.kt", i = {}, l = {713, 728}, m = "invokeSuspend", n = {}, s = {})
public final class HMDeviceSyncManager$syncSpo2Data$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ List<SpO2> $list;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncSpo2Data$1$1(HMDeviceSyncManager hMDeviceSyncManager, String str, List<SpO2> list, Continuation<? super HMDeviceSyncManager$syncSpo2Data$1$1> continuation) {
        super(2, continuation);
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
        this.$list = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncSpo2Data$1$1(this.this$0, this.$did, this.$list, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
        String str = this.$did;
        this.label = 1;
        if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 6, true, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<SpO2> list = this.$list;
        boolean z = list != null && list.size() > 0;
        FitnessLogUtils.i(this.this$0.getTAG(), "syncSpo2Data hasData = " + z);
        if (z) {
            int currentTZOffsetIn15min = FitnessDateUtils.getCurrentTZOffsetIn15min();
            ArrayList arrayList = new ArrayList();
            for (SpO2 spO2 : this.$list) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(spO2.getTime());
                HMDeviceSyncManager.Spo2Data spo2Data = new HMDeviceSyncManager.Spo2Data();
                spo2Data.setTimestamp(spO2.getTime());
                spo2Data.setSpo2(spO2.getValue());
                spo2Data.setLastSyncTime(seconds + 1);
                spo2Data.setTimeZone(currentTZOffsetIn15min);
                arrayList.add(spo2Data);
            }
            HMDeviceSyncManager hMDeviceSyncManager2 = this.this$0;
            String str2 = this.$did;
            String json = hMDeviceSyncManager2.getMGson().toJson(arrayList);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            this.label = 2;
            if (hMDeviceSyncManager2.parseData(6, str2, json, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HMDeviceSyncManager$syncSpo2Data$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
