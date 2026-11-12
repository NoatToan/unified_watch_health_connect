package androidx.health.connect.client.changes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/changes/DeletionChange;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "recordId", "Ljava/lang/String;", "getRecordId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class DeletionChange {

    @NotNull
    private final String recordId;

    public DeletionChange(@NotNull String recordId) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        this.recordId = recordId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DeletionChange.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.health.connect.client.changes.DeletionChange");
        return Intrinsics.areEqual(this.recordId, ((DeletionChange) other).recordId);
    }

    @NotNull
    public final String getRecordId() {
        return this.recordId;
    }

    public int hashCode() {
        return this.recordId.hashCode();
    }
}
