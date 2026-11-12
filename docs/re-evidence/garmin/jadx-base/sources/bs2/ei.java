package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ei extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20081e;

    static {
        bk bkVar = new bk("incident_record", 195);
        f20081e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("speed", 3, 132, 1000.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("probability", 4, 132, 1000.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("detector_probability", 5, 132, 1000.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_mean_threshold", 6, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_std_threshold", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_range_threshold", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("vib_start_delta", 9, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("vib_stop_delta", 10, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ei() {
        super(wb.b(195));
    }

    public ei(bk bkVar) {
        super(bkVar);
    }
}
