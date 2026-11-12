package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Pair<A, B> implements Serializable {
    private final A a;
    private final B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair copy$default(Pair pair, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = pair.a;
        }
        if ((i & 2) != 0) {
            obj2 = pair.b;
        }
        return pair.copy(obj, obj2);
    }

    public final A component1() {
        return this.a;
    }

    public final B component2() {
        return this.b;
    }

    @NotNull
    public final Pair<A, B> copy(A a, B b) {
        return new Pair<>(a, b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.areEqual(this.a, pair.a) && Intrinsics.areEqual(this.b, pair.b);
    }

    public final A getFirst() {
        return this.a;
    }

    public final B getSecond() {
        return this.b;
    }

    public int hashCode() {
        A a = this.a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
