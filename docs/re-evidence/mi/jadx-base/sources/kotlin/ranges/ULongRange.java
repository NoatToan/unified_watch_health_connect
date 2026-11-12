package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
public final class ULongRange extends ULongProgression implements ClosedRange<ULong>, OpenEndRange<ULong> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final ULongRange EMPTY = new ULongRange(-1, 0, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ULongRange getEMPTY() {
            return ULongRange.EMPTY;
        }
    }

    public /* synthetic */ ULongRange(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m2135getEndExclusivesVKNKU$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return m2136containsVKZWuLQ(((ULong) comparable).m1112unboximpl());
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m2136containsVKZWuLQ(long j) {
        return Long.compareUnsigned(m2131getFirstsVKNKU(), j) <= 0 && Long.compareUnsigned(j, m2132getLastsVKNKU()) <= 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongRange) {
            if (!isEmpty() || !((ULongRange) obj).isEmpty()) {
                ULongRange uLongRange = (ULongRange) obj;
                if (m2131getFirstsVKNKU() != uLongRange.m2131getFirstsVKNKU() || m2132getLastsVKNKU() != uLongRange.m2132getLastsVKNKU()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ Comparable getEndExclusive() {
        return ULong.m1054boximpl(m2137getEndExclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m2137getEndExclusivesVKNKU() {
        if (m2132getLastsVKNKU() != -1) {
            return ULong.m1060constructorimpl(m2132getLastsVKNKU() + ULong.m1060constructorimpl(((long) 1) & 4294967295L));
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getEndInclusive() {
        return ULong.m1054boximpl(m2138getEndInclusivesVKNKU());
    }

    /* JADX INFO: renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m2138getEndInclusivesVKNKU() {
        return m2132getLastsVKNKU();
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ Comparable getStart() {
        return ULong.m1054boximpl(m2139getStartsVKNKU());
    }

    /* JADX INFO: renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m2139getStartsVKNKU() {
        return m2131getFirstsVKNKU();
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) ULong.m1060constructorimpl(m2131getFirstsVKNKU() ^ ULong.m1060constructorimpl(m2131getFirstsVKNKU() >>> 32))) * 31) + ((int) ULong.m1060constructorimpl(m2132getLastsVKNKU() ^ ULong.m1060constructorimpl(m2132getLastsVKNKU() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return Long.compareUnsigned(m2131getFirstsVKNKU(), m2132getLastsVKNKU()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    @NotNull
    public String toString() {
        return ((Object) ULong.m1106toStringimpl(m2131getFirstsVKNKU())) + ".." + ((Object) ULong.m1106toStringimpl(m2132getLastsVKNKU()));
    }

    private ULongRange(long j, long j2) {
        super(j, j2, 1L, null);
    }
}
