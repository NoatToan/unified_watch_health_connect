package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class t6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20573e;

    static {
        bk bkVar = new bk("debug_sample_info", 52);
        f20573e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("stream_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.DEBUG_SAMPLE_TYPE));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("rate", 2, 132, 1.0d, 0.0d, "Hz", false, znVar2));
        bkVar.e(new rc("range", 3, 2, 1.0d, 0.0d, "bits", false, znVar));
        bkVar.e(new rc("sensor_location", 4, 0, 1.0d, 0.0d, "", false, zn.SENSOR_LOCATION));
        bkVar.e(new rc("num_channels", 5, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("scale", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(7).f20460i.add(new pw("g_scale", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "counts/g"));
        bkVar.f19753c.get(7).f20460i.get(0).b(1, 0L);
        bkVar.e(new rc("raw_initial", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "counts", false, znVar3));
        bkVar.e(new rc("fractional_timestamp", 8, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("status_type", 9, 0, 1.0d, 0.0d, "", false, zn.DEBUG_SAMPLE_STATUS_TYPE));
        bkVar.e(new rc("nominal_rate", 10, 132, 1.0d, 0.0d, "Hz", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t6() {
        super(wb.b(52));
    }

    public t6(bk bkVar) {
        super(bkVar);
    }
}
