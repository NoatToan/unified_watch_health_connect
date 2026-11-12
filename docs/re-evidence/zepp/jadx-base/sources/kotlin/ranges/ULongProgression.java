package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long a;
    private final long b;
    private final long c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m4259fromClosedRange7ftBX0g(long j, long j2, long j3) {
            return new ULongProgression(j, j2, j3, null);
        }
    }

    private ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = j;
        this.b = UProgressionUtilKt.m4240getProgressionLastElement7ftBX0g(j, j2, j3);
        this.c = j3;
    }

    public /* synthetic */ ULongProgression(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (m4257getFirstsVKNKU() != uLongProgression.m4257getFirstsVKNKU() || m4258getLastsVKNKU() != uLongProgression.m4258getLastsVKNKU() || this.c != uLongProgression.c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m4257getFirstsVKNKU() {
        return this.a;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m4258getLastsVKNKU() {
        return this.b;
    }

    public final long getStep() {
        return this.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        int iM3905constructorimpl = ((((int) ULong.m3905constructorimpl(m4257getFirstsVKNKU() ^ ULong.m3905constructorimpl(m4257getFirstsVKNKU() >>> 32))) * 31) + ((int) ULong.m3905constructorimpl(m4258getLastsVKNKU() ^ ULong.m3905constructorimpl(m4258getLastsVKNKU() >>> 32)))) * 31;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) + iM3905constructorimpl;
    }

    public boolean isEmpty() {
        long j = this.c;
        int iUlongCompare = UnsignedKt.ulongCompare(m4257getFirstsVKNKU(), m4258getLastsVKNKU());
        if (j > 0) {
            if (iUlongCompare > 0) {
                return true;
            }
        } else if (iUlongCompare < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new g(m4257getFirstsVKNKU(), m4258getLastsVKNKU(), this.c, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m3909toStringimpl(m4257getFirstsVKNKU()));
            sb.append("..");
            sb.append((Object) ULong.m3909toStringimpl(m4258getLastsVKNKU()));
            sb.append(" step ");
            j = this.c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m3909toStringimpl(m4257getFirstsVKNKU()));
            sb.append(" downTo ");
            sb.append((Object) ULong.m3909toStringimpl(m4258getLastsVKNKU()));
            sb.append(" step ");
            j = -this.c;
        }
        sb.append(j);
        return sb.toString();
    }
}
