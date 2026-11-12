package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class UIntRange extends UIntProgression implements ClosedRange<UInt>, OpenEndRange<UInt> {

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final UIntRange EMPTY;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UIntRange getEMPTY() {
            return UIntRange.EMPTY;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        EMPTY = new UIntRange(-1, 0, defaultConstructorMarker);
    }

    public /* synthetic */ UIntRange(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA$annotations, reason: not valid java name */
    public static /* synthetic */ void m2126getEndExclusivepVg5ArA$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m2127containsWZ4Q5Ns(((UInt) comparable).m1033unboximpl());
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m2127containsWZ4Q5Ns(int i) {
        return Integer.compareUnsigned(m2122getFirstpVg5ArA(), i) <= 0 && Integer.compareUnsigned(i, m2123getLastpVg5ArA()) <= 0;
    }

    @Override // kotlin.ranges.UIntProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof UIntRange) {
            if (!isEmpty() || !((UIntRange) obj).isEmpty()) {
                UIntRange uIntRange = (UIntRange) obj;
                if (m2122getFirstpVg5ArA() != uIntRange.m2122getFirstpVg5ArA() || m2123getLastpVg5ArA() != uIntRange.m2123getLastpVg5ArA()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return UInt.m975boximpl(m2128getEndExclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndExclusive-pVg5ArA, reason: not valid java name */
    public int m2128getEndExclusivepVg5ArA() {
        if (m2123getLastpVg5ArA() != -1) {
            return UInt.m981constructorimpl(m2123getLastpVg5ArA() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return UInt.m975boximpl(m2129getEndInclusivepVg5ArA());
    }

    /* JADX INFO: renamed from: getEndInclusive-pVg5ArA, reason: not valid java name */
    public int m2129getEndInclusivepVg5ArA() {
        return m2123getLastpVg5ArA();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return UInt.m975boximpl(m2130getStartpVg5ArA());
    }

    /* JADX INFO: renamed from: getStart-pVg5ArA, reason: not valid java name */
    public int m2130getStartpVg5ArA() {
        return m2122getFirstpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m2122getFirstpVg5ArA() * 31) + m2123getLastpVg5ArA();
    }

    @Override // kotlin.ranges.UIntProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Integer.compareUnsigned(m2122getFirstpVg5ArA(), m2123getLastpVg5ArA()) > 0;
    }

    @Override // kotlin.ranges.UIntProgression
    @NotNull
    public String toString() {
        return ((Object) UInt.m1027toStringimpl(m2122getFirstpVg5ArA())) + ".." + ((Object) UInt.m1027toStringimpl(m2123getLastpVg5ArA()));
    }

    private UIntRange(int i, int i2) {
        super(i, i2, 1, null);
    }
}
