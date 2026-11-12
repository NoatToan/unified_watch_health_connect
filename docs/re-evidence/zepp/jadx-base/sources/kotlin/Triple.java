package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class Triple<A, B, C> implements Serializable {
    private final A a;
    private final B b;
    private final C c;

    public Triple(A a, B b, C c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple copy$default(Triple triple, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = triple.a;
        }
        if ((i & 2) != 0) {
            obj2 = triple.b;
        }
        if ((i & 4) != 0) {
            obj3 = triple.c;
        }
        return triple.copy(obj, obj2, obj3);
    }

    public final A component1() {
        return this.a;
    }

    public final B component2() {
        return this.b;
    }

    public final C component3() {
        return this.c;
    }

    @NotNull
    public final Triple<A, B, C> copy(A a, B b, C c) {
        return new Triple<>(a, b, c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return Intrinsics.areEqual(this.a, triple.a) && Intrinsics.areEqual(this.b, triple.b) && Intrinsics.areEqual(this.c, triple.c);
    }

    public final A getFirst() {
        return this.a;
    }

    public final B getSecond() {
        return this.b;
    }

    public final C getThird() {
        return this.c;
    }

    public int hashCode() {
        A a = this.a;
        int iHashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.b;
        int iHashCode2 = (iHashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.c;
        return iHashCode2 + (c != null ? c.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return '(' + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
