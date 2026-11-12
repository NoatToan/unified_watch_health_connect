package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class UnsafeLazyImpl<T> implements Lazy<T>, Serializable {

    @Nullable
    private Function0<? extends T> a;

    @Nullable
    private Object b = UNINITIALIZED_VALUE.INSTANCE;

    public UnsafeLazyImpl(@NotNull Function0<? extends T> function0) {
        this.a = function0;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        if (this.b == UNINITIALIZED_VALUE.INSTANCE) {
            this.b = this.a.invoke();
            this.a = null;
        }
        return (T) this.b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.b != UNINITIALIZED_VALUE.INSTANCE;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
