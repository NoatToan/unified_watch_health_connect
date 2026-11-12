package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class um extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20602e;

    static {
        bk bkVar = new bk("pace_band_split", 311);
        f20602e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("cumulative_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("cumulative_distance", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("target_split_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("target_split_distance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("target_split_avg_speed", 4, 132, 1000.0d, 0.0d, "m/s", false, zn.UINT16));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("start_long", 9, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("start_lat", 10, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("end_long", 11, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("end_lat", 12, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("start_elevation", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar));
        bkVar.e(new rc("end_elevation", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar));
        bkVar.e(new rc("end_bearing", 15, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public um() {
        super(wb.b(311));
    }

    public um(bk bkVar) {
        super(bkVar);
    }
}
