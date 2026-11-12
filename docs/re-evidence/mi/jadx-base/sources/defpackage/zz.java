package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Optional;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class zz<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zz<Object> f41813a = new zz<>();
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> a() {
        return f41813a;
    }

    private Object readResolve() {
        return f41813a;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T t) {
        return (T) g6i.h(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return null;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) g6i.g(optional);
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(Supplier<? extends T> supplier) {
        return (T) g6i.h(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
