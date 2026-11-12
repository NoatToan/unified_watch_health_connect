package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016JM\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"androidx/paging/AsyncPagingDataDiffer$differBase$1", "Landroidx/paging/PagingDataDiffer;", "postEvents", "", "presentNewList", "", "previousList", "Landroidx/paging/NullPaddedList;", "newList", "newCombinedLoadStates", "Landroidx/paging/CombinedLoadStates;", "lastAccessedIndex", "onListPresentable", "Lkotlin/Function0;", "", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Landroidx/paging/CombinedLoadStates;ILkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class AsyncPagingDataDiffer$differBase$1<T> extends PagingDataDiffer<T> {
    final /* synthetic */ AsyncPagingDataDiffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1(AsyncPagingDataDiffer asyncPagingDataDiffer, DifferCallback differCallback, CoroutineDispatcher coroutineDispatcher) {
        super(differCallback, coroutineDispatcher);
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // androidx.paging.PagingDataDiffer
    public boolean postEvents() {
        return this.this$0.getInGetItem();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.PagingDataDiffer
    @Nullable
    public Object presentNewList(@NotNull NullPaddedList<T> nullPaddedList, @NotNull NullPaddedList<T> nullPaddedList2, @NotNull CombinedLoadStates combinedLoadStates, int i, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Integer> continuation) {
        AsyncPagingDataDiffer$differBase$1$presentNewList$1 asyncPagingDataDiffer$differBase$1$presentNewList$1;
        AsyncPagingDataDiffer$differBase$1<T> asyncPagingDataDiffer$differBase$1;
        if (continuation instanceof AsyncPagingDataDiffer$differBase$1$presentNewList$1) {
            asyncPagingDataDiffer$differBase$1$presentNewList$1 = (AsyncPagingDataDiffer$differBase$1$presentNewList$1) continuation;
            int i2 = asyncPagingDataDiffer$differBase$1$presentNewList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncPagingDataDiffer$differBase$1$presentNewList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                asyncPagingDataDiffer$differBase$1$presentNewList$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$1(this, continuation);
            }
        } else {
            asyncPagingDataDiffer$differBase$1$presentNewList$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$1(this, continuation);
        }
        Object objWithContext = asyncPagingDataDiffer$differBase$1$presentNewList$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = asyncPagingDataDiffer$differBase$1$presentNewList$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            if (nullPaddedList.getSize() == 0) {
                function0.invoke();
                this.this$0.getDifferCallback().onInserted(0, nullPaddedList2.getSize());
                return null;
            }
            if (nullPaddedList2.getSize() == 0) {
                function0.invoke();
                this.this$0.getDifferCallback().onRemoved(0, nullPaddedList.getSize());
                return null;
            }
            CoroutineDispatcher coroutineDispatcher = this.this$0.workerDispatcher;
            AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 asyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 = new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this, nullPaddedList, nullPaddedList2, null);
            asyncPagingDataDiffer$differBase$1$presentNewList$1.L$0 = this;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.L$1 = nullPaddedList;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.L$2 = nullPaddedList2;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.L$3 = function0;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.I$0 = i;
            asyncPagingDataDiffer$differBase$1$presentNewList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, asyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1, asyncPagingDataDiffer$differBase$1$presentNewList$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            asyncPagingDataDiffer$differBase$1 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = asyncPagingDataDiffer$differBase$1$presentNewList$1.I$0;
            function0 = (Function0) asyncPagingDataDiffer$differBase$1$presentNewList$1.L$3;
            nullPaddedList2 = (NullPaddedList) asyncPagingDataDiffer$differBase$1$presentNewList$1.L$2;
            nullPaddedList = (NullPaddedList) asyncPagingDataDiffer$differBase$1$presentNewList$1.L$1;
            asyncPagingDataDiffer$differBase$1 = (AsyncPagingDataDiffer$differBase$1) asyncPagingDataDiffer$differBase$1$presentNewList$1.L$0;
            ResultKt.throwOnFailure(objWithContext);
        }
        NullPaddedDiffResult nullPaddedDiffResult = (NullPaddedDiffResult) objWithContext;
        function0.invoke();
        NullPaddedListDiffHelperKt.dispatchDiff(nullPaddedList, asyncPagingDataDiffer$differBase$1.this$0.updateCallback, nullPaddedList2, nullPaddedDiffResult);
        return Boxing.boxInt(NullPaddedListDiffHelperKt.transformAnchorIndex(nullPaddedList, nullPaddedDiffResult, nullPaddedList2, i));
    }
}
