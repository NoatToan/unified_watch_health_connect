package androidx.paging;

import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/paging/NullPaddedDiffResult;", "", "Landroidx/recyclerview/widget/h$e;", "diff", "Landroidx/recyclerview/widget/h$e;", "getDiff", "()Landroidx/recyclerview/widget/h$e;", "", "hasOverlap", "Z", "getHasOverlap", "()Z", "<init>", "(Landroidx/recyclerview/widget/h$e;Z)V", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class NullPaddedDiffResult {

    @NotNull
    private final h.e diff;
    private final boolean hasOverlap;

    public NullPaddedDiffResult(@NotNull h.e diff, boolean z) {
        Intrinsics.checkNotNullParameter(diff, "diff");
        this.diff = diff;
        this.hasOverlap = z;
    }

    @NotNull
    public final h.e getDiff() {
        return this.diff;
    }

    public final boolean getHasOverlap() {
        return this.hasOverlap;
    }
}
