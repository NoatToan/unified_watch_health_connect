package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a2, B b2) {
        this.first = a2;
        this.second = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pair.first;
        }
        if ((i & 2) != 0) {
            obj2 = pair.second;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    @NotNull
    public final Pair<A, B> copy(A a2, B b2) {
        return new Pair<>(a2, b2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.areEqual(this.first, pair.first) && Intrinsics.areEqual(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a2 = this.first;
        int iHashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b2 = this.second;
        return iHashCode + (b2 != null ? b2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
