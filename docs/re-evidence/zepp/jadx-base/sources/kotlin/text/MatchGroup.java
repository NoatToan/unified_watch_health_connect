package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class MatchGroup {

    @NotNull
    private final String a;

    @NotNull
    private final IntRange b;

    public MatchGroup(@NotNull String str, @NotNull IntRange intRange) {
        this.a = str;
        this.b = intRange;
    }

    public static /* synthetic */ MatchGroup copy$default(MatchGroup matchGroup, String str, IntRange intRange, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchGroup.a;
        }
        if ((i & 2) != 0) {
            intRange = matchGroup.b;
        }
        return matchGroup.copy(str, intRange);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final IntRange component2() {
        return this.b;
    }

    @NotNull
    public final MatchGroup copy(@NotNull String str, @NotNull IntRange intRange) {
        return new MatchGroup(str, intRange);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.a, matchGroup.a) && Intrinsics.areEqual(this.b, matchGroup.b);
    }

    @NotNull
    public final IntRange getRange() {
        return this.b;
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
