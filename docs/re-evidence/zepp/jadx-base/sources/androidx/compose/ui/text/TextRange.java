package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0015\b\u0087@\u0018\u0000 +2\u00020\u0001:\u0001+B\u0014\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001b\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\u001d\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\u001f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R\u0013\u0010!\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010\u0012R\u0013\u0010$\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010&\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0013\u0010(\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b'\u0010\u0012ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "other", "", "intersects-5zc-tL8", "(JJ)Z", "intersects", "contains-5zc-tL8", SearchCriteria.CONTAINS, "", "offset", "contains-impl", "(JI)Z", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "packedValue", "J", "getStart-impl", "start", "getEnd-impl", "end", "getMin-impl", "min", "getMax-impl", "max", "getCollapsed-impl", "(J)Z", "collapsed", "getReversed-impl", "reversed", "getLength-impl", SessionDescription.p, "constructor-impl", "(J)J", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1})
@Immutable
@JvmInline
public final class TextRange {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "Landroidx/compose/ui/text/TextRange;", "Zero", "J", "getZero-d9O1mEE", "()J", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m2729getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m2712boximpl(long j) {
        return new TextRange(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m2713constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m2714contains5zctL8(long j, long j2) {
        return m2722getMinimpl(j) <= m2722getMinimpl(j2) && m2721getMaximpl(j2) <= m2721getMaximpl(j);
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m2715containsimpl(long j, int i) {
        return i < m2721getMaximpl(j) && m2722getMinimpl(j) <= i;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m2716equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2717equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m2718getCollapsedimpl(long j) {
        return m2724getStartimpl(j) == m2719getEndimpl(j);
    }

    /* JADX INFO: renamed from: getEnd-impl, reason: not valid java name */
    public static final int m2719getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* JADX INFO: renamed from: getLength-impl, reason: not valid java name */
    public static final int m2720getLengthimpl(long j) {
        return m2721getMaximpl(j) - m2722getMinimpl(j);
    }

    /* JADX INFO: renamed from: getMax-impl, reason: not valid java name */
    public static final int m2721getMaximpl(long j) {
        return m2724getStartimpl(j) > m2719getEndimpl(j) ? m2724getStartimpl(j) : m2719getEndimpl(j);
    }

    /* JADX INFO: renamed from: getMin-impl, reason: not valid java name */
    public static final int m2722getMinimpl(long j) {
        return m2724getStartimpl(j) > m2719getEndimpl(j) ? m2719getEndimpl(j) : m2724getStartimpl(j);
    }

    /* JADX INFO: renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m2723getReversedimpl(long j) {
        return m2724getStartimpl(j) > m2719getEndimpl(j);
    }

    /* JADX INFO: renamed from: getStart-impl, reason: not valid java name */
    public static final int m2724getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m2725hashCodeimpl(long j) {
        return b.a(j);
    }

    /* JADX INFO: renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m2726intersects5zctL8(long j, long j2) {
        return m2722getMinimpl(j) < m2721getMaximpl(j2) && m2722getMinimpl(j2) < m2721getMaximpl(j);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m2727toStringimpl(long j) {
        return "TextRange(" + m2724getStartimpl(j) + ", " + m2719getEndimpl(j) + ')';
    }

    public boolean equals(Object obj) {
        return m2716equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m2725hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m2727toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }
}
