package androidx.health.connect.client.response;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/health/connect/client/response/ChangesResponse;", "", "", "changes", "Ljava/util/List;", "getChanges", "()Ljava/util/List;", "", "nextChangesToken", "Ljava/lang/String;", "getNextChangesToken", "()Ljava/lang/String;", "", "hasMore", "Z", "()Z", "changesTokenExpired", "getChangesTokenExpired", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
public final class ChangesResponse {

    @NotNull
    private final List<Object> changes;
    private final boolean changesTokenExpired;
    private final boolean hasMore;

    @NotNull
    private final String nextChangesToken;

    public ChangesResponse(@NotNull List<Object> changes, @NotNull String nextChangesToken, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(nextChangesToken, "nextChangesToken");
        this.changes = changes;
        this.nextChangesToken = nextChangesToken;
        this.hasMore = z;
        this.changesTokenExpired = z2;
    }

    @NotNull
    public final List<Object> getChanges() {
        return this.changes;
    }

    public final boolean getChangesTokenExpired() {
        return this.changesTokenExpired;
    }

    @NotNull
    public final String getNextChangesToken() {
        return this.nextChangesToken;
    }

    @JvmName(name = "hasMore")
    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }
}
