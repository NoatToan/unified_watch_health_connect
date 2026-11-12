package com.xiaomi.fitness.util;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyEcgReport;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.common.log.Logger;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/util/EcgUil;", "", "<init>", "()V", "TAG", "", "createDayEntriesHome", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "report", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyEcgReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgUil {

    @NotNull
    public static final EcgUil INSTANCE = new EcgUil();

    @NotNull
    public static final String TAG = "EcgUil";

    /* JADX INFO: renamed from: com.xiaomi.fitness.util.EcgUil$createDayEntriesHome$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.util.EcgUil", f = "EcgUil.kt", i = {0, 0}, l = {19}, m = "createDayEntriesHome", n = {"entries", "ecgMeasureRecord"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
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
            return EcgUil.this.createDayEntriesHome(null, this);
        }
    }

    private EcgUil() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x006f, please report this as an issue */
    @Nullable
    public final Object createDayEntriesHome(@NotNull DailyEcgReport dailyEcgReport, @NotNull Continuation<? super List<? extends MaxMinEntry>> continuation) {
        AnonymousClass1 anonymousClass1;
        EcgMedicalItemReport latestItem;
        List list;
        float[] fArr;
        int i;
        boolean z;
        int length;
        float f;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            latestItem = dailyEcgReport.getLatestItem();
            if (latestItem != null) {
                anonymousClass1.L$0 = arrayList;
                anonymousClass1.L$1 = latestItem;
                anonymousClass1.label = 1;
                Object recordData = latestItem.getRecordData(3, 5, anonymousClass1);
                if (recordData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = arrayList;
                obj = recordData;
            } else {
                list = arrayList;
                fArr = null;
            }
            if (fArr != null) {
                if (fArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    length = fArr.length;
                    for (i = 0; i < length; i++) {
                        Logger.d(TAG, "createDayEntriesHome pointList[" + i + "]=" + fArr[i]);
                        f = fArr[i];
                        if (f < 1.5d || f <= -1.5d) {
                            fArr[i] = -10.0f;
                        }
                        MaxMinEntry maxMinEntry = new MaxMinEntry(i, 2.0f + fArr[i], latestItem.getTimestamp(), 3);
                        maxMinEntry.timestamp = latestItem.getTimestamp();
                        list.add(maxMinEntry);
                    }
                }
            }
            return list;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        latestItem = (EcgMedicalItemReport) anonymousClass1.L$1;
        list = (List) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        fArr = (float[]) obj;
        if (fArr != null) {
            if (fArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                length = fArr.length;
                while (i < length) {
                    Logger.d(TAG, "createDayEntriesHome pointList[" + i + "]=" + fArr[i]);
                    f = fArr[i];
                    if (f < 1.5d) {
                        fArr[i] = -10.0f;
                    } else {
                        fArr[i] = -10.0f;
                    }
                    MaxMinEntry maxMinEntry2 = new MaxMinEntry(i, 2.0f + fArr[i], latestItem.getTimestamp(), 3);
                    maxMinEntry2.timestamp = latestItem.getTimestamp();
                    list.add(maxMinEntry2);
                }
            }
        }
        return list;
    }
}
