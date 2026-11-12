package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class yy extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20699e;

    static {
        bk bkVar = new bk("training_target_alert", 17);
        f20699e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("alert_type", 1, 0, 1.0d, 0.0d, "", false, zn.ALERT_TARGET));
        zn znVar = zn.ALERT_MODE;
        bkVar.e(new rc("low_alert_mode", 2, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("low_alert_value", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(3).f20460i.add(new pw("low_alert_heart_rate", 132, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(3).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(3).f20460i.add(new pw("low_alert_speed", 132, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(3).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(3).f20460i.add(new pw("low_alert_cadence", 132, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(3).f20460i.get(2).b(1, 2L);
        bkVar.f19753c.get(3).f20460i.add(new pw("low_alert_power", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(3).f20460i.get(3).b(1, 3L);
        bkVar.f19753c.get(3).f20460i.add(new pw("low_alert_elevation", 132, 5.0d, 500.0d, "m"));
        bkVar.f19753c.get(3).f20460i.get(4).b(1, 4L);
        bkVar.e(new rc("high_alert_mode", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("high_alert_value", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(5).f20460i.add(new pw("high_alert_heart_rate", 132, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(5).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(5).f20460i.add(new pw("high_alert_speed", 132, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(5).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(5).f20460i.add(new pw("high_alert_cadence", 132, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(5).f20460i.get(2).b(1, 2L);
        bkVar.f19753c.get(5).f20460i.add(new pw("high_alert_power", 132, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(5).f20460i.get(3).b(1, 3L);
        bkVar.f19753c.get(5).f20460i.add(new pw("high_alert_elevation", 132, 5.0d, 500.0d, "m"));
        bkVar.f19753c.get(5).f20460i.get(4).b(1, 4L);
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("low_alert_mesg", 6, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("high_alert_mesg", 7, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("in_range_mesg", 8, 7, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("low_alert_value_ext", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(9).f20460i.add(new pw("low_alert_heart_rate_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(9).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(9).f20460i.add(new pw("low_alert_speed_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(9).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(9).f20460i.add(new pw("low_alert_cadence_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(9).f20460i.get(2).b(1, 2L);
        bkVar.f19753c.get(9).f20460i.add(new pw("low_alert_power_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(9).f20460i.get(3).b(1, 3L);
        bkVar.f19753c.get(9).f20460i.add(new pw("low_alert_elevation_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m"));
        bkVar.f19753c.get(9).f20460i.get(4).b(1, 4L);
        bkVar.e(new rc("high_alert_value_ext", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(10).f20460i.add(new pw("high_alert_heart_rate_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bpm"));
        bkVar.f19753c.get(10).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(10).f20460i.add(new pw("high_alert_speed_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s"));
        bkVar.f19753c.get(10).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(10).f20460i.add(new pw("high_alert_cadence_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "rpm"));
        bkVar.f19753c.get(10).f20460i.get(2).b(1, 2L);
        bkVar.f19753c.get(10).f20460i.add(new pw("high_alert_power_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(10).f20460i.get(3).b(1, 3L);
        bkVar.f19753c.get(10).f20460i.add(new pw("high_alert_elevation_ext", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m"));
        bkVar.f19753c.get(10).f20460i.get(4).b(1, 4L);
        bkVar.e(new rc(TtmlNode.ATTR_ID, 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.BOOL;
        bkVar.e(new rc("low_alert_enabled", 12, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("high_alert_enabled", 13, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public yy() {
        super(wb.b(17));
    }

    public yy(bk bkVar) {
        super(bkVar);
    }
}
