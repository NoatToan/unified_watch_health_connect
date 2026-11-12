package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class ULongProgression implements Iterable<ULong>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final long first;
    private final long last;
    private final long step;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-7ftBX0g, reason: not valid java name */
        public final ULongProgression m2133fromClosedRange7ftBX0g(long j, long j2, long j3) {
            return new ULongProgression(j, j2, j3, null);
        }
    }

    public /* synthetic */ ULongProgression(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.first != uLongProgression.first || this.last != uLongProgression.last || this.step != uLongProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-s-VKNKU, reason: not valid java name */
    public final long m2131getFirstsVKNKU() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-s-VKNKU, reason: not valid java name */
    public final long m2132getLastsVKNKU() {
        return this.last;
    }

    public final long getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.first;
        int iM1060constructorimpl = ((int) ULong.m1060constructorimpl(j ^ ULong.m1060constructorimpl(j >>> 32))) * 31;
        long j2 = this.last;
        int iM1060constructorimpl2 = (iM1060constructorimpl + ((int) ULong.m1060constructorimpl(j2 ^ ULong.m1060constructorimpl(j2 >>> 32)))) * 31;
        long j3 = this.step;
        return iM1060constructorimpl2 + ((int) ((j3 >>> 32) ^ j3));
    }

    public boolean isEmpty() {
        long j = this.step;
        long j2 = this.first;
        long j3 = this.last;
        if (j > 0) {
            if (Long.compareUnsigned(j2, j3) <= 0) {
                return false;
            }
        } else if (Long.compareUnsigned(j2, j3) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new ULongProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m1106toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) ULong.m1106toStringimpl(this.last));
            sb.append(" step ");
            j = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m1106toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) ULong.m1106toStringimpl(this.last));
            sb.append(" step ");
            j = -this.step;
        }
        sb.append(j);
        return sb.toString();
    }

    private ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j;
        this.last = UProgressionUtilKt.m2107getProgressionLastElement7ftBX0g(j, j2, j3);
        this.step = j3;
    }
}
