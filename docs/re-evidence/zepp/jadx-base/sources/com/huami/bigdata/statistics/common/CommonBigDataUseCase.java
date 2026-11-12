package com.huami.bigdata.statistics.common;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.usecase.DefaultMergeBigDataUseCase;
import com.huami.bigdata.statistics.core.utils.TimeUtils;
import defpackage.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0014J-\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonBigDataUseCase;", "Lcom/huami/bigdata/statistics/core/usecase/DefaultMergeBigDataUseCase;", "Lcom/huami/bigdata/statistics/common/CommonDateData;", "Lcom/huami/bigdata/statistics/common/CommonStatistics;", "", "from", "to", "", "Lcom/huami/bigdata/statistics/common/CommonBigDataUseCase$DayData;", "getLocalDataList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Class;", "getClassT", "", "dateFormat", "getLocal", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;)V", "DayData", "core_release"}, k = 1, mv = {1, 5, 1})
@Deprecated(message = "请替换为CommonV2BigDataUseCase")
public abstract class CommonBigDataUseCase extends DefaultMergeBigDataUseCase<CommonDateData, CommonStatistics> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0084\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/huami/bigdata/statistics/common/CommonBigDataUseCase$DayData;", "", "", "component1", "", "component2", "", "component3", "timestamp", "timezoneId", "value", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getTimezoneId", "()Ljava/lang/String;", "c", LogUtil.I, "getValue", "()I", "<init>", "(JLjava/lang/String;I)V", "core_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DayData {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final long timestamp;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        private final String timezoneId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int value;

        public DayData(long j, @NotNull String str, int i) {
            this.timestamp = j;
            this.timezoneId = str;
            this.value = i;
        }

        public static /* synthetic */ DayData copy$default(DayData dayData, long j, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = dayData.timestamp;
            }
            if ((i2 & 2) != 0) {
                str = dayData.timezoneId;
            }
            if ((i2 & 4) != 0) {
                i = dayData.value;
            }
            return dayData.copy(j, str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTimezoneId() {
            return this.timezoneId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        public final DayData copy(long timestamp, @NotNull String timezoneId, int value) {
            return new DayData(timestamp, timezoneId, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayData)) {
                return false;
            }
            DayData dayData = (DayData) other;
            return this.timestamp == dayData.timestamp && Intrinsics.areEqual(this.timezoneId, dayData.timezoneId) && this.value == dayData.value;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        @NotNull
        public final String getTimezoneId() {
            return this.timezoneId;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((b.a(this.timestamp) * 31) + this.timezoneId.hashCode()) * 31) + this.value;
        }

        @NotNull
        public String toString() {
            return "DayData(timestamp=" + this.timestamp + ", timezoneId=" + this.timezoneId + ", value=" + this.value + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bigdata.statistics.common.CommonBigDataUseCase", f = "CommonBigDataUseCase.kt", i = {0}, l = {38}, m = "getLocal$suspendImpl", n = {"dateFormat"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return CommonBigDataUseCase.d(CommonBigDataUseCase.this, 0L, 0L, null, this);
        }
    }

    public CommonBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi) {
        super(iBigDataExportedApi);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object d(CommonBigDataUseCase commonBigDataUseCase, long j, long j2, String str, Continuation continuation) {
        a aVar;
        Object next;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = commonBigDataUseCase.new a(continuation);
            }
        } else {
            aVar = commonBigDataUseCase.new a(continuation);
        }
        a aVar2 = aVar;
        Object localDataList = aVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(localDataList);
            aVar2.a = str;
            aVar2.d = 1;
            localDataList = commonBigDataUseCase.getLocalDataList(j, j2, aVar2);
            if (localDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.a;
            ResultKt.throwOnFailure(localDataList);
        }
        List<DayData> list = (List) localDataList;
        Object next2 = null;
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap();
        for (DayData dayData : list) {
            String strTimestampToFormat = TimeUtils.INSTANCE.timestampToFormat(dayData.getTimestamp(), str, TimeZone.getTimeZone(dayData.getTimezoneId()));
            if (map.containsKey(strTimestampToFormat)) {
                if (((CommonDateData) map.get(strTimestampToFormat)).getMax() < dayData.getValue()) {
                    ((CommonDateData) map.get(strTimestampToFormat)).setMax(dayData.getValue());
                }
                if (((CommonDateData) map.get(strTimestampToFormat)).getMin() > dayData.getValue()) {
                    ((CommonDateData) map.get(strTimestampToFormat)).setMin(dayData.getValue());
                }
            } else {
                CommonDateData commonDateData = new CommonDateData(dayData.getValue(), dayData.getValue());
                commonDateData.setDate(strTimestampToFormat);
                map.put(strTimestampToFormat, commonDateData);
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Integer numBoxInt = Boxing.boxInt(((DayData) next).getValue());
                do {
                    Object next3 = it2.next();
                    Integer numBoxInt2 = Boxing.boxInt(((DayData) next3).getValue());
                    if (numBoxInt.compareTo(numBoxInt2) < 0) {
                        next = next3;
                        numBoxInt = numBoxInt2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        int value = ((DayData) next).getValue();
        Iterator it3 = list.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                Integer numBoxInt3 = Boxing.boxInt(((DayData) next2).getValue());
                do {
                    Object next4 = it3.next();
                    Integer numBoxInt4 = Boxing.boxInt(((DayData) next4).getValue());
                    if (numBoxInt3.compareTo(numBoxInt4) > 0) {
                        next2 = next4;
                        numBoxInt3 = numBoxInt4;
                    }
                } while (it3.hasNext());
            }
        }
        int value2 = ((DayData) next2).getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList.add(Boxing.boxInt(((DayData) it4.next()).getValue()));
        }
        CommonStatistics commonStatistics = new CommonStatistics(value, value2, c.roundToInt(CollectionsKt___CollectionsKt.averageOfInt(arrayList)), list.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it5 = map.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList2.add((CommonDateData) ((Map.Entry) it5.next()).getValue());
        }
        commonStatistics.setDataArray(CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator<T>() { // from class: com.huami.bigdata.statistics.common.CommonBigDataUseCase$getLocal$lambda-7$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((CommonDateData) t).getDate(), ((CommonDateData) t2).getDate());
            }
        }));
        return commonStatistics;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @NotNull
    public Class<CommonStatistics> getClassT() {
        return CommonStatistics.class;
    }

    @Override // com.huami.bigdata.statistics.core.usecase.AbstractBigDataUseCase
    @Nullable
    public Object getLocal(long j, long j2, @NotNull String str, @NotNull Continuation<? super CommonStatistics> continuation) {
        return d(this, j, j2, str, continuation);
    }

    @Nullable
    public abstract Object getLocalDataList(long j, long j2, @NotNull Continuation<? super List<DayData>> continuation);
}
