package androidx.health.connect.client;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import defpackage.yzc;
import defpackage.zcp;
import defpackage.zcv;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086H¢\u0006\u0002\u0010\t\u001a&\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0086H¢\u0006\u0002\u0010\f\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000e\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0086H¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"deleteRecords", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/health/connect/client/records/Record;", "Landroidx/health/connect/client/HealthConnectClient;", "recordIdsList", "", "", "clientRecordIdsList", "(Landroidx/health/connect/client/HealthConnectClient;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Landroidx/health/connect/client/HealthConnectClient;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", "recordId", "(Landroidx/health/connect/client/HealthConnectClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HealthConnectClientExt {
    public static final /* synthetic */ <T extends Record> Object deleteRecords(HealthConnectClient healthConnectClient, List<String> list, List<String> list2, Continuation<? super yzc> continuation) {
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        healthConnectClient.deleteRecords(zcv.b(Record.class), list, list2, continuation);
        return yzc.e;
    }

    public static final /* synthetic */ <T extends Record> Object deleteRecords(HealthConnectClient healthConnectClient, TimeRangeFilter timeRangeFilter, Continuation<? super yzc> continuation) {
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        healthConnectClient.deleteRecords(zcv.b(Record.class), timeRangeFilter, continuation);
        return yzc.e;
    }

    public static final /* synthetic */ <T extends Record> Object readRecord(HealthConnectClient healthConnectClient, String str, Continuation<? super ReadRecordResponse<T>> continuation) {
        zcp.b(4, ExifInterface.GPS_DIRECTION_TRUE);
        return healthConnectClient.readRecord(zcv.b(Record.class), str, continuation);
    }
}
