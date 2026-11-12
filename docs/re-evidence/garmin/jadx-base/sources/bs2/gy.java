package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class gy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20171e;

    static {
        bk bkVar = new bk("training_duration_alert", 16);
        f20171e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("alert_type", 1, 0, 1.0d, 0.0d, "", false, zn.ALERT_DURATION));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("alert_value", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(2).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_calories", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "calories"));
        bkVar.f19753c.get(2).f20460i.get(2).b(1, 2L);
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_ascent", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(2).f20460i.get(3).b(1, 3L);
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_descent", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(2).f20460i.get(4).b(1, 4L);
        bkVar.f19753c.get(2).f20460i.add(new pw("alert_reps", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "reps"));
        bkVar.f19753c.get(2).f20460i.get(5).b(1, 5L);
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("enabled", 3, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("alert_mesg", 4, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("repeat", 5, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alert_mesg_index", 7, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("custom_type", 8, 0, 1.0d, 0.0d, "", false, zn.ALERT_DURATION_CUSTOM_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gy() {
        super(wb.b(16));
    }

    public gy(bk bkVar) {
        super(bkVar);
    }
}
