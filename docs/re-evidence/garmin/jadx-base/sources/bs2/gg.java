package bs2;

import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20165e;

    static {
        bk bkVar = new bk("historical_hrv", GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE);
        f20165e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("newest_timestamp_local", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("newest_from_primary", 1, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("rmssd_7d_average_sleep", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("baseline_balanced_lower", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("baseline_balanced_upper", 4, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gg() {
        super(wb.b(GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE));
    }

    public gg(bk bkVar) {
        super(bkVar);
    }
}
