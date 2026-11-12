package androidx.compose.ui.text.platform.extensions;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0002\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/SpanRange;", "", "component1", "", "component2", "component3", "span", "start", "end", "copy", "", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "getSpan", "()Ljava/lang/Object;", LogUtil.I, "getStart", "()I", "getEnd", "<init>", "(Ljava/lang/Object;II)V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
final /* data */ class SpanRange {
    private final int end;

    @NotNull
    private final Object span;
    private final int start;

    public SpanRange(@NotNull Object obj, int i, int i2) {
        this.span = obj;
        this.start = i;
        this.end = i2;
    }

    public static /* synthetic */ SpanRange copy$default(SpanRange spanRange, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            obj = spanRange.span;
        }
        if ((i3 & 2) != 0) {
            i = spanRange.start;
        }
        if ((i3 & 4) != 0) {
            i2 = spanRange.end;
        }
        return spanRange.copy(obj, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final SpanRange copy(@NotNull Object span, int start, int end) {
        return new SpanRange(span, start, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanRange)) {
            return false;
        }
        SpanRange spanRange = (SpanRange) other;
        return Intrinsics.areEqual(this.span, spanRange.span) && this.start == spanRange.start && this.end == spanRange.end;
    }

    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final Object getSpan() {
        return this.span;
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((this.span.hashCode() * 31) + this.start) * 31) + this.end;
    }

    @NotNull
    public String toString() {
        return "SpanRange(span=" + this.span + ", start=" + this.start + ", end=" + this.end + ')';
    }
}
