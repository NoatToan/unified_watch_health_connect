package com.xiaomi.fit.fitness.device.hm;

import com.huami.bluetooth.profile.channel.module.openapp.entities.ActivityData;
import com.huami.bluetooth.profile.channel.module.openapp.entities.StandData;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.item.ValidStandItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fit.fitness.device.hm.HMDeviceSyncManager$syncActivityData$2$onDataPulled$1", f = "HMDeviceSyncManager.kt", i = {}, l = {539, 581}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nHMDeviceSyncManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$syncActivityData$2$onDataPulled$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1428:1\n37#2:1429\n36#2,3:1430\n*S KotlinDebug\n*F\n+ 1 HMDeviceSyncManager.kt\ncom/xiaomi/fit/fitness/device/hm/HMDeviceSyncManager$syncActivityData$2$onDataPulled$1\n*L\n577#1:1429\n577#1:1430,3\n*E\n"})
public final class HMDeviceSyncManager$syncActivityData$2$onDataPulled$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ ArrayList<ActivityData> $p0;
    int label;
    final /* synthetic */ HMDeviceSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMDeviceSyncManager$syncActivityData$2$onDataPulled$1(ArrayList<ActivityData> arrayList, HMDeviceSyncManager hMDeviceSyncManager, String str, Continuation<? super HMDeviceSyncManager$syncActivityData$2$onDataPulled$1> continuation) {
        super(2, continuation);
        this.$p0 = arrayList;
        this.this$0 = hMDeviceSyncManager;
        this.$did = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HMDeviceSyncManager$syncActivityData$2$onDataPulled$1(this.$p0, this.this$0, this.$did, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList<ActivityData> arrayList = this.$p0;
        if (arrayList == null || arrayList.isEmpty()) {
            FitnessLogUtils.i(this.this$0.getTAG(), "syncActivityData: no data");
            HMDeviceSyncManager hMDeviceSyncManager = this.this$0;
            String str = this.$did;
            this.label = 1;
            if (hMDeviceSyncManager.updateDataTypeSyncedResult(str, 9, true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        FitnessLogUtils.i(this.this$0.getTAG(), "syncActivityData: (" + this.$p0.size() + ") days");
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        ArrayList arrayList2 = new ArrayList();
        Iterator<ActivityData> it = this.$p0.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        long j = 0;
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            ActivityData next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ActivityData activityData = next;
            int time = activityData.getTime();
            if (time <= 0) {
                FitnessLogUtils.i(this.this$0.getTAG(), "syncActivityData: time(" + time + "-" + activityData + ") illegal, and continue");
            } else {
                long jChangeZeroOfTheDay = FitnessDateUtils.changeZeroOfTheDay(time, currentTZOffsetInSec);
                if (jChangeZeroOfTheDay > j) {
                    j = jChangeZeroOfTheDay;
                }
                if (activityData.getDataStand() == null) {
                    FitnessLogUtils.i(this.this$0.getTAG(), "syncActivityData: " + activityData.getTime() + "-no stand");
                } else {
                    StandData dataStand = activityData.getDataStand();
                    Intrinsics.checkNotNull(dataStand);
                    ArrayList<Integer> standPerHour = dataStand.getStandPerHour();
                    int size = standPerHour.size();
                    while (i2 < size) {
                        if (standPerHour.get(i2).intValue() > 0) {
                            long j2 = ((long) (i2 * 3600)) + jChangeZeroOfTheDay;
                            arrayList2.add(new ValidStandItem(j2, ((long) 3600) + j2));
                            FitnessLogUtils.i(this.this$0.getTAG(), "syncActivityData-time=" + j2);
                        }
                        i2++;
                        it = it;
                        j = j;
                    }
                }
                it = it;
                j = j;
            }
        }
        FitnessDataRecorder fitnessDataExtKt = FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE);
        String str2 = this.$did;
        ValidStandItem[] validStandItemArr = (ValidStandItem[]) arrayList2.toArray(new ValidStandItem[0]);
        fitnessDataExtKt.recordValidStand(str2, currentTZOffsetInSec, (ValidStandItem[]) Arrays.copyOf(validStandItemArr, validStandItemArr.length));
        this.this$0.setTheLastSyncTime("huami_vitality_index", j);
        HMDeviceSyncManager hMDeviceSyncManager2 = this.this$0;
        String str3 = this.$did;
        this.label = 2;
        if (hMDeviceSyncManager2.updateDataTypeSyncedResult(str3, 9, true, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HMDeviceSyncManager$syncActivityData$2$onDataPulled$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
