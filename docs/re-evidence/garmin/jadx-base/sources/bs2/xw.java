package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20678e;

    static {
        bk bkVar = new bk("swim_debug_event", 89);
        f20678e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.SWIM_DEBUG_EVENT_TYPE));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 1, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("actual_event_timestamp", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("actual_event_fractional_timestamp", 3, 132, 32768.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.BYTE;
        bkVar.e(new rc("data8", 4, 13, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(5).f20459h.add(new vc(5, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("data", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.f19753c.get(6).f20460i.add(new pw("pool_length", 2, 1.0d, 0.0d, "m"));
        bkVar.f19753c.get(6).f20460i.get(0).b(0, 17L);
        bkVar.f19753c.get(6).f20460i.add(new pw("turn_score", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(1).b(0, 20L);
        bkVar.f19753c.get(6).f20460i.add(new pw("core_index", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(2).b(0, 19L);
        bkVar.f19753c.get(6).f20460i.add(new pw("stroke_count_x", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(3).b(0, 21L);
        bkVar.f19753c.get(6).f20460i.add(new pw("stroke_count_y", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(4).b(0, 22L);
        bkVar.f19753c.get(6).f20460i.add(new pw("pushoff_index", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(5).b(0, 23L);
        bkVar.f19753c.get(6).f20460i.add(new pw("xz_y_power_ratio", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(6).b(0, 24L);
        bkVar.f19753c.get(6).f20460i.add(new pw("power_3d", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(7).b(0, 25L);
        bkVar.f19753c.get(6).f20460i.add(new pw("power_1d_ratios", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(8).b(0, 26L);
        bkVar.f19753c.get(6).f20460i.add(new pw("last_cross_ratio", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(6).f20460i.get(9).b(0, 27L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar3));
    }

    public xw() {
        super(wb.b(89));
    }

    public xw(bk bkVar) {
        super(bkVar);
    }
}
