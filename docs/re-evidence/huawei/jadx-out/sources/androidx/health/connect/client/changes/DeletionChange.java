package androidx.health.connect.client.changes;

import com.huawei.operation.utils.Constants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/changes/DeletionChange;", "Landroidx/health/connect/client/changes/Change;", "recordId", "", "<init>", "(Ljava/lang/String;)V", "getRecordId", "()Ljava/lang/String;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeletionChange implements Change {
    private final String recordId;

    public DeletionChange(String str) {
        zcp.c(str, "");
        this.recordId = str;
    }

    public final String getRecordId() {
        return this.recordId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        return zcp.b((Object) this.recordId, (Object) ((DeletionChange) other).recordId);
    }

    public int hashCode() {
        return this.recordId.hashCode();
    }

    public String toString() {
        return "DeletionChange(recordId='" + this.recordId + Constants.RIGHT_BRACKET;
    }
}
