package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class im extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20219e;

    static {
        bk bkVar = new bk("obdii_data", 174);
        f20219e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("time_offset", 1, 132, 1.0d, 0.0d, "ms", false, znVar2));
        zn znVar3 = zn.BYTE;
        bkVar.e(new rc("pid", 2, 13, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("raw_data", 3, 13, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("pid_data_size", 4, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("system_time", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("start_timestamp", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("start_timestamp_ms", 7, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar3));
    }

    public im() {
        super(wb.b(174));
    }

    public im(bk bkVar) {
        super(bkVar);
    }
}
