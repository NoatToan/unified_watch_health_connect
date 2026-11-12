package androidx.health.connect.client.changes;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/changes/ChangesEvent;", "", "", "nextChangesToken", "Ljava/lang/String;", "getNextChangesToken", "()Ljava/lang/String;", "", "changes", "Ljava/util/List;", "getChanges", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ChangesEvent {

    @NotNull
    private final List<Object> changes;

    @NotNull
    private final String nextChangesToken;

    public ChangesEvent(@NotNull String nextChangesToken, @NotNull List<Object> changes) {
        Intrinsics.checkNotNullParameter(nextChangesToken, "nextChangesToken");
        Intrinsics.checkNotNullParameter(changes, "changes");
        this.nextChangesToken = nextChangesToken;
        this.changes = changes;
    }

    @NotNull
    public final List<Object> getChanges() {
        return this.changes;
    }

    @NotNull
    public final String getNextChangesToken() {
        return this.nextChangesToken;
    }
}
