package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class am extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19681e;

    static {
        bk bkVar = new bk("neural_network_info", 273);
        f19681e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("network_version", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("implicit_message_duration", 1, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("local_timestamp", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("sleep_source", 3, 0, 1.0d, 0.0d, "", false, zn.SLEEP_SOURCE));
        bkVar.e(new rc("ete_version", 4, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public am() {
        super(wb.b(273));
    }

    public am(bk bkVar) {
        super(bkVar);
    }
}
