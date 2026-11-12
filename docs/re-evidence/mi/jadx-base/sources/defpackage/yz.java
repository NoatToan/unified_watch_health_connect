package defpackage;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class yz<T> extends Optional<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yz<Object> f40702a = new yz<>();
    private static final long serialVersionUID = 0;

    public static <T> Optional<T> a() {
        return f40702a;
    }

    private Object readResolve() {
        return f40702a;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.emptySet();
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
        return (T) c6i.p(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(dua<? super T, V> duaVar) {
        c6i.o(duaVar);
        return Optional.absent();
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        return (Optional) c6i.o(optional);
    }

    @Override // com.google.common.base.Optional
    public T or(spo<? extends T> spoVar) {
        return (T) c6i.p(spoVar.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
