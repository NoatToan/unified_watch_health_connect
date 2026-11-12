package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Optional;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class n7i<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f27621a;

    public n7i(T t) {
        this.f27621a = t;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean equals(Object obj) {
        if (obj instanceof n7i) {
            return this.f27621a.equals(((n7i) obj).f27621a);
        }
        return false;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T get() {
        return this.f27621a;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public int hashCode() {
        return this.f27621a.hashCode() + 1502476572;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(T t) {
        g6i.h(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f27621a;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T orNull() {
        return this.f27621a;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public String toString() {
        return "Optional.of(" + this.f27621a + ")";
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        g6i.g(optional);
        return this;
    }

    @Override // androidx.camera.core.impl.utils.Optional
    public T or(Supplier<? extends T> supplier) {
        g6i.g(supplier);
        return this.f27621a;
    }
}
