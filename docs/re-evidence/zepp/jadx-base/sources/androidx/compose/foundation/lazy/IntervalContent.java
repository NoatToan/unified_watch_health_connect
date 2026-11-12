package androidx.compose.foundation.lazy;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001Be\u0012#\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u00127\u0010\u0011\u001a3\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u000b¢\u0006\u0002\b\u0010¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nRJ\u0010\u0011\u001a3\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u000b¢\u0006\u0002\b\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/IntervalContent;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "key", "Lkotlin/jvm/functions/Function1;", "getKey", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "Lkotlin/jvm/functions/Function2;", "getContent", "()Lkotlin/jvm/functions/Function2;", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final class IntervalContent {

    @NotNull
    private final Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>> content;

    @Nullable
    private final Function1<Integer, Object> key;

    /* JADX WARN: Multi-variable type inference failed */
    public IntervalContent(@Nullable Function1<? super Integer, ? extends Object> function1, @NotNull Function2<? super LazyItemScope, ? super Integer, ? extends Function2<? super Composer, ? super Integer, Unit>> function2) {
        this.key = function1;
        this.content = function2;
    }

    @NotNull
    public final Function2<LazyItemScope, Integer, Function2<Composer, Integer, Unit>> getContent() {
        return this.content;
    }

    @Nullable
    public final Function1<Integer, Object> getKey() {
        return this.key;
    }
}
