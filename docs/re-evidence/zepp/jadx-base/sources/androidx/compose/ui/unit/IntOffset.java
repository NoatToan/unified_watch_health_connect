package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087@\u0018\u0000 42\u00020\u0001:\u00014B\u0014\b\u0000\u0012\u0006\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0006\u0010\u0004J*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u0019J!\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0004J\u001a\u0010)\u001a\u00020&2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001c\u0010+\u001a\u00020*8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010.R\u001c\u0010\b\u001a\u00020\u00028F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010.\u001a\u0004\b/\u0010\u0004R\u001c\u0010\t\u001a\u00020\u00028F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b2\u0010.\u001a\u0004\b1\u0010\u0004ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "x", "y", "copy-iSbpLlY", "(JII)J", "copy", "other", "minus-qkQi6aY", "(JJ)J", "minus", "plus-qkQi6aY", "plus", "unaryMinus-nOcc-ac", "(J)J", "unaryMinus", "", "operand", "times-Bjo55l4", "(JF)J", "times", "div-Bjo55l4", b.q, "rem-Bjo55l4", "(JI)J", "rem", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "packedValue", "J", "getPackedValue$annotations", "()V", "getX-impl", "getX$annotations", "getY-impl", "getY$annotations", "constructor-impl", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1})
@Immutable
@JvmInline
public final class IntOffset {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = IntOffsetKt.IntOffset(0, 0);
    private final long packedValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "Landroidx/compose/ui/unit/IntOffset;", "Zero", "J", "getZero-nOcc-ac", "()J", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-nOcc-ac, reason: not valid java name */
        public final long m3053getZeronOccac() {
            return IntOffset.Zero;
        }
    }

    private /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntOffset m3034boximpl(long j) {
        return new IntOffset(j);
    }

    @Stable
    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final int m3035component1impl(long j) {
        return m3043getXimpl(j);
    }

    @Stable
    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final int m3036component2impl(long j) {
        return m3044getYimpl(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m3037constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: copy-iSbpLlY, reason: not valid java name */
    public static final long m3038copyiSbpLlY(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i, i2);
    }

    /* JADX INFO: renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static /* synthetic */ long m3039copyiSbpLlY$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = m3043getXimpl(j);
        }
        if ((i3 & 2) != 0) {
            i2 = m3044getYimpl(j);
        }
        return m3038copyiSbpLlY(j, i, i2);
    }

    @Stable
    /* JADX INFO: renamed from: div-Bjo55l4, reason: not valid java name */
    public static final long m3040divBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(c.roundToInt(m3043getXimpl(j) / f), c.roundToInt(m3044getYimpl(j) / f));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3041equalsimpl(long j, Object obj) {
        return (obj instanceof IntOffset) && j == ((IntOffset) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3042equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void getX$annotations() {
    }

    /* JADX INFO: renamed from: getX-impl, reason: not valid java name */
    public static final int m3043getXimpl(long j) {
        return (int) (j >> 32);
    }

    @Stable
    public static /* synthetic */ void getY$annotations() {
    }

    /* JADX INFO: renamed from: getY-impl, reason: not valid java name */
    public static final int m3044getYimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3045hashCodeimpl(long j) {
        return defpackage.b.a(j);
    }

    @Stable
    /* JADX INFO: renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m3046minusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m3043getXimpl(j) - m3043getXimpl(j2), m3044getYimpl(j) - m3044getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m3047plusqkQi6aY(long j, long j2) {
        return IntOffsetKt.IntOffset(m3043getXimpl(j) + m3043getXimpl(j2), m3044getYimpl(j) + m3044getYimpl(j2));
    }

    @Stable
    /* JADX INFO: renamed from: rem-Bjo55l4, reason: not valid java name */
    public static final long m3048remBjo55l4(long j, int i) {
        return IntOffsetKt.IntOffset(m3043getXimpl(j) % i, m3044getYimpl(j) % i);
    }

    @Stable
    /* JADX INFO: renamed from: times-Bjo55l4, reason: not valid java name */
    public static final long m3049timesBjo55l4(long j, float f) {
        return IntOffsetKt.IntOffset(c.roundToInt(m3043getXimpl(j) * f), c.roundToInt(m3044getYimpl(j) * f));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3050toStringimpl(long j) {
        return '(' + m3043getXimpl(j) + ", " + m3044getYimpl(j) + ')';
    }

    @Stable
    /* JADX INFO: renamed from: unaryMinus-nOcc-ac, reason: not valid java name */
    public static final long m3051unaryMinusnOccac(long j) {
        return IntOffsetKt.IntOffset(-m3043getXimpl(j), -m3044getYimpl(j));
    }

    public boolean equals(Object obj) {
        return m3041equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m3045hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m3050toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
