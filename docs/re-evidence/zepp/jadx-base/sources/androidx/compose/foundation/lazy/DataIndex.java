package androidx.compose.foundation.lazy;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0003J\u001a\u0010\u001b\u001a\u00020\u00182\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/DataIndex;", "", "inc-jQJCoq8", "(I)I", "inc", "dec-jQJCoq8", "dec", "", "i", "plus-PBKCTt8", "(II)I", "plus", "minus-PBKCTt8", "minus", "minus-yUvdeeg", "other", "compareTo-ZjPyQlc", "compareTo", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", LogUtil.I, "getValue", "()I", "constructor-impl", "foundation_release"}, k = 1, mv = {1, 5, 1})
@JvmInline
public final class DataIndex {
    private final int value;

    private /* synthetic */ DataIndex(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DataIndex m335boximpl(int i) {
        return new DataIndex(i);
    }

    /* JADX INFO: renamed from: compareTo-ZjPyQlc, reason: not valid java name */
    public static final int m336compareToZjPyQlc(int i, int i2) {
        return i - i2;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m337constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: dec-jQJCoq8, reason: not valid java name */
    public static final int m338decjQJCoq8(int i) {
        return m337constructorimpl(i - 1);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m339equalsimpl(int i, Object obj) {
        return (obj instanceof DataIndex) && i == ((DataIndex) obj).m347unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m340equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m341hashCodeimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: inc-jQJCoq8, reason: not valid java name */
    public static final int m342incjQJCoq8(int i) {
        return m337constructorimpl(i + 1);
    }

    /* JADX INFO: renamed from: minus-PBKCTt8, reason: not valid java name */
    public static final int m343minusPBKCTt8(int i, int i2) {
        return m337constructorimpl(i - i2);
    }

    /* JADX INFO: renamed from: minus-yUvdeeg, reason: not valid java name */
    public static final int m344minusyUvdeeg(int i, int i2) {
        return m337constructorimpl(i - i2);
    }

    /* JADX INFO: renamed from: plus-PBKCTt8, reason: not valid java name */
    public static final int m345plusPBKCTt8(int i, int i2) {
        return m337constructorimpl(i + i2);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m346toStringimpl(int i) {
        return "DataIndex(value=" + i + ')';
    }

    public boolean equals(Object obj) {
        return m339equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m341hashCodeimpl(this.value);
    }

    public String toString() {
        return m346toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m347unboximpl() {
        return this.value;
    }
}
