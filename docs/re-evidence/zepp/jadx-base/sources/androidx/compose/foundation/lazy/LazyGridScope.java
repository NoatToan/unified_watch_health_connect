package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/lazy/LazyGridScope;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "item", "(Lkotlin/jvm/functions/Function3;)V", "", "count", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "itemContent", "items", "(ILkotlin/jvm/functions/Function4;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
public interface LazyGridScope {
    void item(@NotNull Function3<? super LazyItemScope, ? super Composer, ? super Integer, Unit> content);

    void items(int count, @NotNull Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> itemContent);
}
