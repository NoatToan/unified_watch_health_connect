package androidx.compose.runtime.snapshots;

import f4.f;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotApplyConflictException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lf4/f;", "snapshot", "<init>", "(Lf4/f;)V", "Lf4/f;", "getSnapshot", "()Lf4/f;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    private final f snapshot;

    public SnapshotApplyConflictException(f fVar) {
        this.snapshot = fVar;
    }

    public final f getSnapshot() {
        return this.snapshot;
    }
}
