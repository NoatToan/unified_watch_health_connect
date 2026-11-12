package androidx.health.connect.client.changes;

import androidx.health.connect.client.records.Record;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/changes/UpsertionChange;", "Landroidx/health/connect/client/changes/Change;", "record", "Landroidx/health/connect/client/records/Record;", "<init>", "(Landroidx/health/connect/client/records/Record;)V", "getRecord", "()Landroidx/health/connect/client/records/Record;", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpsertionChange implements Change {
    private final Record record;

    public UpsertionChange(Record record) {
        zcp.c(record, "");
        this.record = record;
    }

    public final Record getRecord() {
        return this.record;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!zcp.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        zcp.e(other, "");
        return zcp.b(this.record, ((UpsertionChange) other).record);
    }

    public int hashCode() {
        return this.record.hashCode();
    }
}
