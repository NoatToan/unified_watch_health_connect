package androidx.health.connect.client.impl.converters.response;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.platform.client.proto.DataProto;
import androidx.health.platform.client.proto.ResponseProto;
import defpackage.yzp;
import defpackage.zcp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"toReadRecordsResponse", "Landroidx/health/connect/client/response/ReadRecordsResponse;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "proto", "Landroidx/health/platform/client/proto/ResponseProto$ReadDataRangeResponse;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ProtoToReadRecordsResponseKt {
    public static final <T extends Record> ReadRecordsResponse<T> toReadRecordsResponse(ResponseProto.ReadDataRangeResponse readDataRangeResponse) {
        zcp.c(readDataRangeResponse, "");
        List<DataProto.DataPoint> dataPointList = readDataRangeResponse.getDataPointList();
        zcp.b((Object) dataPointList, "");
        List<DataProto.DataPoint> list = dataPointList;
        ArrayList arrayList = new ArrayList(yzp.e(list, 10));
        for (DataProto.DataPoint dataPoint : list) {
            zcp.e(dataPoint);
            Record record = ProtoToRecordConvertersKt.toRecord(dataPoint);
            zcp.e(record, "");
            arrayList.add(record);
        }
        return new ReadRecordsResponse<>(arrayList, readDataRangeResponse.getPageToken());
    }
}
