package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20191e;

    static {
        bk bkVar = new bk("gps_user_behavior", 316);
        f20191e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("cep_download_count", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("device_life_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("gps_source", 2, 140, 1.0d, 0.0d, "", false, zn.GPS_SOURCE));
        bkVar.e(new rc("gps_source_count", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hf() {
        super(wb.b(316));
    }

    public hf(bk bkVar) {
        super(bkVar);
    }
}
