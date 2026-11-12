package com.huami.dragview.draglist;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/huami/dragview/draglist/DataCallback;", "", "", "Lcom/huami/dragview/draglist/DragEntry;", "loadData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "saveData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragview_release"}, k = 1, mv = {1, 4, 0})
public interface DataCallback {
    @Nullable
    Object loadData(@NotNull Continuation<? super List<DragEntry>> continuation);

    @Nullable
    Object saveData(@NotNull List<DragEntry> list, @NotNull Continuation<? super Boolean> continuation);
}
