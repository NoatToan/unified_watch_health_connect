package defpackage;

import com.google.common.base.Optional;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class m7i<T> extends Optional<T> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f25844a;

    public m7i(T t) {
        this.f25844a = t;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.f25844a);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof m7i) {
            return this.f25844a.equals(((m7i) obj).f25844a);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.f25844a;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.f25844a.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
        c6i.p(t, "use Optional.orNull() instead of Optional.or(null)");
        return this.f25844a;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.f25844a;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        String strValueOf = String.valueOf(this.f25844a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(dua<? super T, V> duaVar) {
        return new m7i(c6i.p(duaVar.apply(this.f25844a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        c6i.o(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(spo<? extends T> spoVar) {
        c6i.o(spoVar);
        return this.f25844a;
    }
}
