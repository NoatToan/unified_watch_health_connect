package kotlin;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class InitializedLazyImpl<T> implements Lazy<T>, Serializable {
    private final T a;

    public InitializedLazyImpl(T t) {
        this.a = t;
    }

    @Override // kotlin.Lazy
    public T getValue() {
        return this.a;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
