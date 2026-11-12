package androidx.health.connect.client.response;

import androidx.health.connect.client.changes.Change;
import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u00020\b8G¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/health/connect/client/response/ChangesResponse;", "", "changes", "", "Landroidx/health/connect/client/changes/Change;", "nextChangesToken", "", "hasMore", "", "changesTokenExpired", "<init>", "(Ljava/util/List;Ljava/lang/String;ZZ)V", "getChanges", "()Ljava/util/List;", "getNextChangesToken", "()Ljava/lang/String;", "()Z", "getChangesTokenExpired", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangesResponse {
    private final List<Change> changes;
    private final boolean changesTokenExpired;
    private final boolean hasMore;
    private final String nextChangesToken;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangesResponse(List<? extends Change> list, String str, boolean z, boolean z2) {
        zcp.c(list, "");
        zcp.c(str, "");
        this.changes = list;
        this.nextChangesToken = str;
        this.hasMore = z;
        this.changesTokenExpired = z2;
    }

    public final List<Change> getChanges() {
        return this.changes;
    }

    public final String getNextChangesToken() {
        return this.nextChangesToken;
    }

    /* JADX INFO: renamed from: hasMore, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getChangesTokenExpired() {
        return this.changesTokenExpired;
    }
}
