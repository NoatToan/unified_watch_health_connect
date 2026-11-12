package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class x1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20660e;

    static {
        bk bkVar = new bk("barometer_data", 209);
        f20660e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sample_time_offset", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("baro_pres", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "Pa", false, znVar2));
        bkVar.e(new rc("enhanced_altitude", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x1() {
        super(wb.b(209));
    }

    public x1(bk bkVar) {
        super(bkVar);
    }
}
