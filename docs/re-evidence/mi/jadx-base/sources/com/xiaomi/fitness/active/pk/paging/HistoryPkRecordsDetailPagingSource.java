package com.xiaomi.fitness.active.pk.paging;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.xiaomi.fitness.active.pk.ActivePkRepository;
import com.xiaomi.fitness.active.pk.PkConstants;
import com.xiaomi.fitness.active.pk.net.model.GetHistoryPkRecordsResult;
import com.xiaomi.fitness.active.pk.net.model.PkRecordDetail;
import com.xiaomi.fitness.active.pk.util.PkLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/active/pk/paging/HistoryPkRecordsDetailPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/xiaomi/fitness/active/pk/net/model/PkRecordDetail;", "pkStatus", PkConstants.PARAM_PK_UID, "", "activePkRepository", "Lcom/xiaomi/fitness/active/pk/ActivePkRepository;", "<init>", "(ILjava/lang/Long;Lcom/xiaomi/fitness/active/pk/ActivePkRepository;)V", "Ljava/lang/Long;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "active-pk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoryPkRecordsDetailPagingSource extends PagingSource<Integer, PkRecordDetail> {

    @NotNull
    public static final String TAG = "PkRecordsPagingSource";

    @NotNull
    private final ActivePkRepository activePkRepository;
    private final int pkStatus;

    @Nullable
    private final Long pkUid;

    /* JADX INFO: renamed from: com.xiaomi.fitness.active.pk.paging.HistoryPkRecordsDetailPagingSource$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.active.pk.paging.HistoryPkRecordsDetailPagingSource", f = "HistoryPkRecordsDetailPagingSource.kt", i = {}, l = {31}, m = "load", n = {}, s = {})
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
            return HistoryPkRecordsDetailPagingSource.this.load(null, this);
        }
    }

    public /* synthetic */ HistoryPkRecordsDetailPagingSource(int i, Long l, ActivePkRepository activePkRepository, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : l, activePkRepository);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull PagingSource.LoadParams<Integer> loadParams, @NotNull Continuation<? super PagingSource.LoadResult<Integer, PkRecordDetail>> continuation) {
        AnonymousClass1 anonymousClass1;
        List<PkRecordDetail> listEmptyList;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object historyPkRecordsDetail$default = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(historyPkRecordsDetail$default);
                PkLogger.INSTANCE.d(TAG, "start load key " + loadParams.getKey(), new Object[0]);
                ActivePkRepository activePkRepository = this.activePkRepository;
                int i3 = this.pkStatus;
                Long l = this.pkUid;
                Integer num = loadParams instanceof PagingSource.LoadParams.Append ? (Integer) ((PagingSource.LoadParams.Append) loadParams).getKey() : null;
                Integer numBoxInt = Boxing.boxInt(20);
                anonymousClass2.label = 1;
                historyPkRecordsDetail$default = ActivePkRepository.getHistoryPkRecordsDetail$default(activePkRepository, i3, l, num, numBoxInt, false, anonymousClass2, 16, null);
                if (historyPkRecordsDetail$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(historyPkRecordsDetail$default);
            }
            GetHistoryPkRecordsResult getHistoryPkRecordsResult = (GetHistoryPkRecordsResult) historyPkRecordsDetail$default;
            if (getHistoryPkRecordsResult == null || (listEmptyList = getHistoryPkRecordsResult.getPkList()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            return new PagingSource.LoadResult.Page(listEmptyList, null, ((getHistoryPkRecordsResult != null ? Boxing.boxInt(getHistoryPkRecordsResult.getNextKey()) : null) == null || getHistoryPkRecordsResult.getNextKey() <= 0) ? null : Boxing.boxInt(getHistoryPkRecordsResult.getNextKey()));
        } catch (Exception e) {
            PkLogger.INSTANCE.i(TAG, "start load exception:" + e, new Object[0]);
            return new PagingSource.LoadResult.Error(e);
        }
    }

    public HistoryPkRecordsDetailPagingSource(int i, @Nullable Long l, @NotNull ActivePkRepository activePkRepository) {
        Intrinsics.checkNotNullParameter(activePkRepository, "activePkRepository");
        this.pkStatus = i;
        this.pkUid = l;
        this.activePkRepository = activePkRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    @Nullable
    public Integer getRefreshKey(@NotNull PagingState<Integer, PkRecordDetail> state) {
        Integer nextKey;
        int iIntValue;
        Integer prevKey;
        Intrinsics.checkNotNullParameter(state, "state");
        Integer anchorPosition = state.getAnchorPosition();
        Integer numValueOf = null;
        if (anchorPosition != null) {
            PagingSource.LoadResult.Page<Integer, PkRecordDetail> pageClosestPageToPosition = state.closestPageToPosition(anchorPosition.intValue());
            if (pageClosestPageToPosition != null && (prevKey = pageClosestPageToPosition.getPrevKey()) != null) {
                iIntValue = prevKey.intValue() + 1;
            } else if (pageClosestPageToPosition != null && (nextKey = pageClosestPageToPosition.getNextKey()) != null) {
                iIntValue = nextKey.intValue() - 1;
            }
            numValueOf = Integer.valueOf(iIntValue);
        }
        PkLogger.INSTANCE.d(TAG, "getRefreshKey result " + numValueOf + " , start " + state, new Object[0]);
        return numValueOf;
    }
}
