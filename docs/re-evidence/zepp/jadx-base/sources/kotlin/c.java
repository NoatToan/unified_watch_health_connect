package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes23.dex */
public class c extends LazyKt__LazyJVMKt {
    @InlineOnly
    private static final <T> T a(Lazy<? extends T> lazy, Object obj, KProperty<?> kProperty) {
        return lazy.getValue();
    }

    @NotNull
    public static <T> Lazy<T> lazyOf(T t) {
        return new InitializedLazyImpl(t);
    }
}
