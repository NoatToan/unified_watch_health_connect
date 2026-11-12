package com.google.common.graph;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class ElementOrder<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f4549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private final Comparator<T> f4550c;

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    private ElementOrder(Type type, @CheckForNull Comparator<T> comparator) {
        this.f4549b = (Type) Preconditions.checkNotNull(type);
        this.f4550c = comparator;
        Preconditions.checkState((type == Type.SORTED) == (comparator != null));
    }

    public static <S> ElementOrder<S> b() {
        return new ElementOrder<>(Type.UNORDERED, null);
    }

    public static <S> ElementOrder<S> e() {
        return new ElementOrder<>(Type.INSERTION, null);
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        return this.f4549b == elementOrder.f4549b && Objects.equal(this.f4550c, elementOrder.f4550c);
    }

    public int hashCode() {
        return Objects.hashCode(this.f4549b, this.f4550c);
    }

    public String toString() {
        MoreObjects.ToStringHelper toStringHelperAdd = MoreObjects.toStringHelper(this).add("type", this.f4549b);
        Comparator<T> comparator = this.f4550c;
        if (comparator != null) {
            toStringHelperAdd.add("comparator", comparator);
        }
        return toStringHelperAdd.toString();
    }
}
