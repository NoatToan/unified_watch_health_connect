package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20442e;

    static {
        bk bkVar = new bk("sub_second_record", 467);
        f20442e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("position_lon", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("distance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("position_time_offset", 4, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qw() {
        super(wb.b(467));
    }

    public qw(bk bkVar) {
        super(bkVar);
    }
}
