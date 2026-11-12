package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int first;
    private final int last;
    private final int step;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m2124fromClosedRangeNkh28Cs(int i, int i2, int i3) {
            return new UIntProgression(i, i2, i3, null);
        }
    }

    public /* synthetic */ UIntProgression(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (this.first != uIntProgression.first || this.last != uIntProgression.last || this.step != uIntProgression.step) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m2122getFirstpVg5ArA() {
        return this.first;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m2123getLastpVg5ArA() {
        return this.last;
    }

    public final int getStep() {
        return this.step;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.first * 31) + this.last) * 31) + this.step;
    }

    public boolean isEmpty() {
        if (this.step > 0) {
            if (Integer.compareUnsigned(this.first, this.last) <= 0) {
                return false;
            }
        } else if (Integer.compareUnsigned(this.first, this.last) >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new UIntProgressionIterator(this.first, this.last, this.step, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.step > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m1027toStringimpl(this.first));
            sb.append("..");
            sb.append((Object) UInt.m1027toStringimpl(this.last));
            sb.append(" step ");
            i = this.step;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m1027toStringimpl(this.first));
            sb.append(" downTo ");
            sb.append((Object) UInt.m1027toStringimpl(this.last));
            sb.append(" step ");
            i = -this.step;
        }
        sb.append(i);
        return sb.toString();
    }

    private UIntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = i;
        this.last = UProgressionUtilKt.m2108getProgressionLastElementNkh28Cs(i, i2, i3);
        this.step = i3;
    }
}
