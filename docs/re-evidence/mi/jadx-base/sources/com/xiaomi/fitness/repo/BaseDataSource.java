package com.xiaomi.fitness.repo;

import android.annotation.SuppressLint;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import androidx.room.InvalidationTracker;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.repository.PagingSourceParams;
import com.xiaomi.fit.fitness.export.data.ITimeData;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b \u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001DB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001d\u001a\u00020\u001eH\u0003J#\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0002\u0010\"J(\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0096@¢\u0006\u0002\u0010&J(\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0082@¢\u0006\u0002\u0010&J(\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0082@¢\u0006\u0002\u0010&J(\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0082@¢\u0006\u0002\u0010&J<\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\f2\b\b\u0002\u0010.\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010/J!\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u00104J\u000e\u0010\u0014\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0004J\u0016\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004J\u000e\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001bJ\u000e\u0010;\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u001bJ<\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000=2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001bH¦@¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\b\u0012\u0004\u0012\u00020\n0BH\u0002¢\u0006\u0002\u0010CR\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/xiaomi/fitness/repo/BaseDataSource;", "Value", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Landroidx/paging/PagingSource;", "", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "<init>", "(Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;)V", "TAG", "", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()I", "zoneOffsetInSec$delegate", "Lkotlin/Lazy;", "queryStartTime", "getQueryStartTime", "()Ljava/lang/Long;", "setQueryStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "queryEndTime", "getQueryEndTime", "setQueryEndTime", "canLoadNextMore", "", "canLoadPrevMore", "observerTable", "", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Long;", "load", "Landroidx/paging/PagingSource$LoadResult;", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initLoad", "nextLoad", "prevLoad", "doLoadData", "startTime", "endTime", "loadSize", "isNext", "(JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "normalizeRange", "Lcom/xiaomi/fitness/repo/BaseDataSource$QueryRange;", "nextKey", "prevKey", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fitness/repo/BaseDataSource$QueryRange;", "time", "setQueryTime", "startTimeInSecond", "endTimeInSecond", "setCanLoadNextMore", "loadMore", "setCanLoadPrevMore", "getDataRecord", "", "pageSize", "reverse", "(JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTableNames", "", "()[Ljava/lang/String;", "QueryRange", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseDataSource<Value extends ITimeData> extends PagingSource<Long, Value> {
    private boolean canLoadNextMore;
    private boolean canLoadPrevMore;

    @Nullable
    private Long queryEndTime;

    @Nullable
    private Long queryStartTime;

    @NotNull
    private final String TAG = "BaseDataSource";

    /* JADX INFO: renamed from: zoneOffsetInSec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy zoneOffsetInSec = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l62
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(FitnessDateUtils.getCurrentTZOffsetInSec());
        }
    });

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/repo/BaseDataSource$QueryRange;", "", "nextKey", "", "prevKey", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "getNextKey", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPrevKey", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/Long;)Lcom/xiaomi/fitness/repo/BaseDataSource$QueryRange;", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QueryRange {

        @Nullable
        private final Long nextKey;

        @Nullable
        private final Long prevKey;

        /* JADX WARN: Multi-variable type inference failed */
        public QueryRange() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ QueryRange copy$default(QueryRange queryRange, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = queryRange.nextKey;
            }
            if ((i & 2) != 0) {
                l2 = queryRange.prevKey;
            }
            return queryRange.copy(l, l2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getNextKey() {
            return this.nextKey;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getPrevKey() {
            return this.prevKey;
        }

        @NotNull
        public final QueryRange copy(@Nullable Long nextKey, @Nullable Long prevKey) {
            return new QueryRange(nextKey, prevKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QueryRange)) {
                return false;
            }
            QueryRange queryRange = (QueryRange) other;
            return Intrinsics.areEqual(this.nextKey, queryRange.nextKey) && Intrinsics.areEqual(this.prevKey, queryRange.prevKey);
        }

        @Nullable
        public final Long getNextKey() {
            return this.nextKey;
        }

        @Nullable
        public final Long getPrevKey() {
            return this.prevKey;
        }

        public int hashCode() {
            Long l = this.nextKey;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.prevKey;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "QueryRange(nextKey=" + this.nextKey + ", prevKey=" + this.prevKey + ")";
        }

        public QueryRange(@Nullable Long l, @Nullable Long l2) {
            this.nextKey = l;
            this.prevKey = l2;
        }

        public /* synthetic */ QueryRange(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.BaseDataSource$doLoadData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.BaseDataSource", f = "BaseDataSource.kt", i = {0, 0, 0, 0, 0}, l = {139}, m = "doLoadData", n = {"this", "startTime", "endTime", "loadSize", "isNext"}, s = {"L$0", "J$0", "J$1", "I$0", "Z$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseDataSource<Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseDataSource<Value> baseDataSource, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = baseDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doLoadData(0L, 0L, 0, false, this);
        }
    }

    public BaseDataSource(@Nullable PagingSourceParams pagingSourceParams) {
        Boolean canLoadNextMore;
        Boolean canLoadPrevMore;
        boolean zBooleanValue = true;
        this.canLoadNextMore = true;
        this.canLoadPrevMore = true;
        this.queryStartTime = pagingSourceParams != null ? pagingSourceParams.getQueryStartTime() : null;
        this.queryEndTime = pagingSourceParams != null ? pagingSourceParams.getQueryEndTime() : null;
        this.canLoadPrevMore = (pagingSourceParams == null || (canLoadPrevMore = pagingSourceParams.getCanLoadPrevMore()) == null) ? true : canLoadPrevMore.booleanValue();
        if (pagingSourceParams != null && (canLoadNextMore = pagingSourceParams.getCanLoadNextMore()) != null) {
            zBooleanValue = canLoadNextMore.booleanValue();
        }
        this.canLoadNextMore = zBooleanValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object doLoadData(long j, long j2, int i, boolean z, Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        AnonymousClass1 anonymousClass1;
        long j3;
        long j4;
        int i2;
        boolean z2;
        BaseDataSource baseDataSource;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object dataRecord = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass2.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(dataRecord);
            int zoneOffsetInSec = getZoneOffsetInSec();
            anonymousClass2.L$0 = this;
            j3 = j;
            anonymousClass2.J$0 = j3;
            j4 = j2;
            anonymousClass2.J$1 = j4;
            i2 = i;
            anonymousClass2.I$0 = i2;
            anonymousClass2.Z$0 = z;
            anonymousClass2.label = 1;
            dataRecord = getDataRecord(j, j2, zoneOffsetInSec, i, z, anonymousClass2);
            if (dataRecord == coroutine_suspended) {
                return coroutine_suspended;
            }
            z2 = z;
            baseDataSource = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = anonymousClass2.Z$0;
            int i5 = anonymousClass2.I$0;
            long j5 = anonymousClass2.J$1;
            long j6 = anonymousClass2.J$0;
            BaseDataSource baseDataSource2 = (BaseDataSource) anonymousClass2.L$0;
            ResultKt.throwOnFailure(dataRecord);
            i2 = i5;
            j4 = j5;
            j3 = j6;
            baseDataSource = baseDataSource2;
        }
        List list = (List) dataRecord;
        if (!z2) {
            Collections.sort(list, new Comparator<ITimeData>() { // from class: com.xiaomi.fitness.repo.BaseDataSource.doLoadData.2
                @Override // java.util.Comparator
                public int compare(ITimeData a2, ITimeData b2) {
                    Intrinsics.checkNotNullParameter(a2, "a");
                    Intrinsics.checkNotNullParameter(b2, "b");
                    return Intrinsics.compare(b2.getTimestamp(), a2.getTimestamp());
                }
            });
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            FitnessLogUtils.i(baseDataSource.TAG, "data is empty time range [" + j3 + ", " + j4 + "], pageSize = " + i2);
            List listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return new PagingSource.LoadResult.Page(listEmptyList, null, null);
        }
        FitnessLogUtils.i(baseDataSource.TAG, "load data: itemSize = " + list.size() + " in range [" + j3 + ", " + j4 + "]");
        QueryRange queryRangeNormalizeRange = baseDataSource.normalizeRange(Boxing.boxLong(((ITimeData) CollectionsKt___CollectionsKt.last(list)).getTimestamp() - 1), Boxing.boxLong(((ITimeData) CollectionsKt___CollectionsKt.first(list)).getTimestamp() + 1));
        Long prevKey = queryRangeNormalizeRange.getPrevKey();
        Long nextKey = queryRangeNormalizeRange.getNextKey();
        FitnessLogUtils.w(baseDataSource.TAG, "end doLoadData， prevKey = " + prevKey + ", nextKey = " + nextKey + " <<<<<<<<< ");
        return new PagingSource.LoadResult.Page(list, prevKey, nextKey);
    }

    public static /* synthetic */ Object doLoadData$default(BaseDataSource baseDataSource, long j, long j2, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj == null) {
            return baseDataSource.doLoadData(j, j2, i, (i2 & 8) != 0 ? true : z, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doLoadData");
    }

    private final String[] getTableNames() {
        return new String[]{FitnessDBConstants.TABLE_BLOOD_PRESSURE, FitnessDBConstants.TABLE_SLEEP, FitnessDBConstants.TABLE_HEART_RATE, "spo2_record", FitnessDBConstants.TABLE_WEIGHT, "stress_record"};
    }

    private final int getZoneOffsetInSec() {
        return ((Number) this.zoneOffsetInSec.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initLoad(PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        long jLongValue;
        long jLongValue2;
        FitnessLogUtils.w(this.TAG, "initLoad params.key = " + loadParams.getKey() + ", param = " + loadParams + ", pageSize = " + loadParams.getLoadSize());
        Long l = this.queryEndTime;
        if (l != null) {
            Intrinsics.checkNotNull(l);
            jLongValue = l.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        long j = jLongValue;
        Long l2 = this.queryStartTime;
        if (l2 != null) {
            Intrinsics.checkNotNull(l2);
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        long j2 = jLongValue2;
        FitnessLogUtils.i(this.TAG, "initLoad: start = " + j2 + ", end = " + j);
        return doLoadData$default(this, j2, j, loadParams.getLoadSize(), false, continuation, 8, null);
    }

    public static /* synthetic */ <Value extends ITimeData> Object load$suspendImpl(BaseDataSource<Value> baseDataSource, PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        FitnessLogUtils.w(((BaseDataSource) baseDataSource).TAG, ">>>>>> load params = " + loadParams);
        if (loadParams instanceof PagingSource.LoadParams.Refresh) {
            return baseDataSource.initLoad(loadParams, continuation);
        }
        if (loadParams instanceof PagingSource.LoadParams.Prepend) {
            return baseDataSource.prevLoad(loadParams, continuation);
        }
        if (loadParams instanceof PagingSource.LoadParams.Append) {
            return baseDataSource.nextLoad(loadParams, continuation);
        }
        List listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        return new PagingSource.LoadResult.Page(listEmptyList, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nextLoad(PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        long jLongValue;
        FitnessLogUtils.w(this.TAG, "nextLoad params = " + loadParams.getKey() + ", pageSize = " + loadParams.getLoadSize());
        if (loadParams.getKey() == null) {
            FitnessLogUtils.e(this.TAG, "params.key == null");
            List listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return new PagingSource.LoadResult.Page(listEmptyList, null, null);
        }
        Long key = loadParams.getKey();
        Intrinsics.checkNotNull(key);
        long jLongValue2 = key.longValue();
        Long l = this.queryStartTime;
        if (l == null || this.canLoadNextMore) {
            jLongValue = 0;
        } else {
            Intrinsics.checkNotNull(l);
            jLongValue = l.longValue();
        }
        long j = jLongValue;
        FitnessLogUtils.i(this.TAG, "nextLoad: start = " + j + ", end = " + jLongValue2);
        return doLoadData$default(this, j, jLongValue2, loadParams.getLoadSize(), false, continuation, 8, null);
    }

    private final QueryRange normalizeRange(Long nextKey, Long prevKey) {
        if (this.queryStartTime != null) {
            Intrinsics.checkNotNull(nextKey);
            long jLongValue = nextKey.longValue();
            Long l = this.queryStartTime;
            Intrinsics.checkNotNull(l);
            if (jLongValue < l.longValue() && !this.canLoadNextMore) {
                nextKey = null;
            }
        }
        if (this.queryEndTime != null) {
            Intrinsics.checkNotNull(prevKey);
            long jLongValue2 = prevKey.longValue();
            Long l2 = this.queryEndTime;
            Intrinsics.checkNotNull(l2);
            if (jLongValue2 > l2.longValue() && !this.canLoadPrevMore) {
                prevKey = null;
            }
        }
        return new QueryRange(nextKey, prevKey);
    }

    @SuppressLint({"RestrictedApi"})
    private final void observerTable() {
        FitnessDatabase.INSTANCE.getInstance().getInvalidationTracker().addWeakObserver(new InvalidationTracker.Observer(this, getTableNames()) { // from class: com.xiaomi.fitness.repo.BaseDataSource.observerTable.1
            final /* synthetic */ BaseDataSource<Value> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                this.this$0.invalidate();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prevLoad(PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        long jLongValue;
        FitnessLogUtils.w(this.TAG, "prevLoad params = " + loadParams + ", pageSize = " + loadParams.getLoadSize());
        if (loadParams.getKey() == null) {
            List listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return new PagingSource.LoadResult.Page(listEmptyList, null, null);
        }
        Long key = loadParams.getKey();
        Intrinsics.checkNotNull(key);
        long jLongValue2 = key.longValue();
        Long l = this.queryEndTime;
        if (l == null || this.canLoadPrevMore) {
            jLongValue = Long.MAX_VALUE;
        } else {
            Intrinsics.checkNotNull(l);
            jLongValue = l.longValue();
        }
        long j = jLongValue;
        FitnessLogUtils.i(this.TAG, "prevLoad: start = " + jLongValue2 + ", end = " + j);
        return doLoadData(jLongValue2, j, loadParams.getLoadSize(), false, continuation);
    }

    @Nullable
    public abstract Object getDataRecord(long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<? extends Value>> continuation);

    @Nullable
    public final Long getQueryEndTime() {
        return this.queryEndTime;
    }

    @Nullable
    public final Long getQueryStartTime() {
        return this.queryStartTime;
    }

    @Override // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull PagingSource.LoadParams<Long> loadParams, @NotNull Continuation<? super PagingSource.LoadResult<Long, Value>> continuation) {
        return load$suspendImpl(this, loadParams, continuation);
    }

    public final void setCanLoadNextMore(boolean loadMore) {
        this.canLoadNextMore = loadMore;
    }

    public final void setCanLoadPrevMore(boolean loadMore) {
        this.canLoadPrevMore = loadMore;
    }

    public final void setQueryEndTime(@Nullable Long l) {
        this.queryEndTime = l;
    }

    public final void setQueryStartTime(@Nullable Long l) {
        this.queryStartTime = l;
    }

    public final void setQueryTime(long startTimeInSecond, long endTimeInSecond) {
        this.queryStartTime = Long.valueOf(startTimeInSecond);
        this.queryEndTime = Long.valueOf(endTimeInSecond);
        if (startTimeInSecond <= endTimeInSecond) {
            return;
        }
        throw new IllegalArgumentException("startTime(" + startTimeInSecond + ") need < endTime(" + endTimeInSecond + ")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Long getRefreshKey(@NotNull PagingState<Long, Value> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FitnessLogUtils.e(this.TAG, "0 getRefreshKey pos=" + state.getAnchorPosition());
        Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition != null) {
            int iIntValue = anchorPosition.intValue();
            FitnessLogUtils.e(this.TAG, "1 getRefreshKey pos=" + state.getAnchorPosition());
            PagingSource.LoadResult.Page<Long, Value> pageClosestPageToPosition = state.closestPageToPosition(iIntValue);
            if (pageClosestPageToPosition == null) {
                return null;
            }
            FitnessLogUtils.e(this.TAG, "2 getRefreshKey pos=" + state.getAnchorPosition());
            Long prevKey = pageClosestPageToPosition.getPrevKey();
            if (prevKey != null) {
                FitnessLogUtils.e(this.TAG, "3 getRefreshKey prevKey=" + prevKey);
                return prevKey;
            }
            Long nextKey = pageClosestPageToPosition.getNextKey();
            if (nextKey != null) {
                FitnessLogUtils.e(this.TAG, "4 getRefreshKey nextKey=" + nextKey);
                return nextKey;
            }
        }
        return null;
    }

    public final void setQueryEndTime(long time) {
        this.queryEndTime = Long.valueOf(time);
        this.queryStartTime = 0L;
    }

    public final void setQueryStartTime(long time) {
        this.queryStartTime = Long.valueOf(time);
        this.queryEndTime = Long.MIN_VALUE;
    }
}
