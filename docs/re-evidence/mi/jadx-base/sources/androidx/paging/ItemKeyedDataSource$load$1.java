package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0001\"\b\b\u0001\u0010\u0003*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\b0\u0007H\u0080@"}, d2 = {"load", "", "Key", "Value", "params", "Landroidx/paging/DataSource$Params;", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/paging/DataSource$BaseResult;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.ItemKeyedDataSource", f = "ItemKeyedDataSource.kt", i = {}, l = {171, 177, 178}, m = "load$paging_common", n = {}, s = {})
public final class ItemKeyedDataSource$load$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ItemKeyedDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemKeyedDataSource$load$1(ItemKeyedDataSource itemKeyedDataSource, Continuation continuation) {
        super(continuation);
        this.this$0 = itemKeyedDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load$paging_common(null, this);
    }
}
