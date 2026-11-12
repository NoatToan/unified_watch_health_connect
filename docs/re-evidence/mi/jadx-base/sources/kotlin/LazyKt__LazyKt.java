package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class LazyKt__LazyKt extends LazyKt__LazyJVMKt {
    @InlineOnly
    private static final <T> T getValue(Lazy<? extends T> lazy, Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return lazy.getValue();
    }

    @NotNull
    public static <T> Lazy<T> lazyOf(T t) {
        return new InitializedLazyImpl(t);
    }
}
