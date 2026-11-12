package kotlin;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
final class m<T> implements Lazy<T>, Serializable {

    @Nullable
    private Function0<? extends T> a;

    @Nullable
    private volatile Object b;

    @NotNull
    private final Object c;

    public m(@NotNull Function0<? extends T> function0, @Nullable Object obj) {
        this.a = function0;
        this.b = UNINITIALIZED_VALUE.INSTANCE;
        this.c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.Lazy
    public T getValue() {
        T tInvoke;
        T t = (T) this.b;
        UNINITIALIZED_VALUE uninitialized_value = UNINITIALIZED_VALUE.INSTANCE;
        if (t != uninitialized_value) {
            return t;
        }
        synchronized (this.c) {
            tInvoke = (T) this.b;
            if (tInvoke == uninitialized_value) {
                tInvoke = this.a.invoke();
                this.b = tInvoke;
                this.a = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.b != UNINITIALIZED_VALUE.INSTANCE;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ m(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i & 2) != 0 ? null : obj);
    }
}
