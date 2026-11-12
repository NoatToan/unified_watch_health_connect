package androidx.health.connect.client.changes;

import defpackage.zcp;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/health/connect/client/changes/ChangesEvent;", "", "nextChangesToken", "", "changes", "", "Landroidx/health/connect/client/changes/Change;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getNextChangesToken", "()Ljava/lang/String;", "getChanges", "()Ljava/util/List;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangesEvent {
    private final List<Change> changes;
    private final String nextChangesToken;

    /* JADX WARN: Multi-variable type inference failed */
    public ChangesEvent(String str, List<? extends Change> list) {
        zcp.c(str, "");
        zcp.c(list, "");
        this.nextChangesToken = str;
        this.changes = list;
    }

    public final String getNextChangesToken() {
        return this.nextChangesToken;
    }

    public final List<Change> getChanges() {
        return this.changes;
    }
}
