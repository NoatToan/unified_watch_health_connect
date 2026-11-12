package androidx.health.connect.client.response;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Record;
import defpackage.zcp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "", "record", "<init>", "(Landroidx/health/connect/client/records/Record;)V", "getRecord", "()Landroidx/health/connect/client/records/Record;", "Landroidx/health/connect/client/records/Record;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReadRecordResponse<T extends Record> {
    private final T record;

    public ReadRecordResponse(T t) {
        zcp.c(t, "");
        this.record = t;
    }

    public final T getRecord() {
        return this.record;
    }
}
