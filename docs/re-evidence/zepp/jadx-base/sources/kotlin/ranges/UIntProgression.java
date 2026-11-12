package kotlin.ranges;

import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
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
public class UIntProgression implements Iterable<UInt>, KMappedMarker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int a;
    private final int b;
    private final int c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: fromClosedRange-Nkh28Cs, reason: not valid java name */
        public final UIntProgression m4253fromClosedRangeNkh28Cs(int i, int i2, int i3) {
            return new UIntProgression(i, i2, i3, null);
        }
    }

    private UIntProgression(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i;
        this.b = UProgressionUtilKt.m4241getProgressionLastElementNkh28Cs(i, i2, i3);
        this.c = i3;
    }

    public /* synthetic */ UIntProgression(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntProgression) {
            if (!isEmpty() || !((UIntProgression) obj).isEmpty()) {
                UIntProgression uIntProgression = (UIntProgression) obj;
                if (m4251getFirstpVg5ArA() != uIntProgression.m4251getFirstpVg5ArA() || m4252getLastpVg5ArA() != uIntProgression.m4252getLastpVg5ArA() || this.c != uIntProgression.c) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: getFirst-pVg5ArA, reason: not valid java name */
    public final int m4251getFirstpVg5ArA() {
        return this.a;
    }

    /* JADX INFO: renamed from: getLast-pVg5ArA, reason: not valid java name */
    public final int m4252getLastpVg5ArA() {
        return this.b;
    }

    public final int getStep() {
        return this.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((m4251getFirstpVg5ArA() * 31) + m4252getLastpVg5ArA()) * 31) + this.c;
    }

    public boolean isEmpty() {
        if (this.c > 0) {
            if (UnsignedKt.uintCompare(m4251getFirstpVg5ArA(), m4252getLastpVg5ArA()) > 0) {
                return true;
            }
        } else if (UnsignedKt.uintCompare(m4251getFirstpVg5ArA(), m4252getLastpVg5ArA()) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<UInt> iterator() {
        return new f(m4251getFirstpVg5ArA(), m4252getLastpVg5ArA(), this.c, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.c > 0) {
            sb = new StringBuilder();
            sb.append((Object) UInt.m3884toStringimpl(m4251getFirstpVg5ArA()));
            sb.append("..");
            sb.append((Object) UInt.m3884toStringimpl(m4252getLastpVg5ArA()));
            sb.append(" step ");
            i = this.c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) UInt.m3884toStringimpl(m4251getFirstpVg5ArA()));
            sb.append(" downTo ");
            sb.append((Object) UInt.m3884toStringimpl(m4252getLastpVg5ArA()));
            sb.append(" step ");
            i = -this.c;
        }
        sb.append(i);
        return sb.toString();
    }
}
