package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class my extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20320e;

    static {
        bk bkVar = new bk("training_interval_alert", 74);
        f20320e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.ALERT_DURATION;
        bkVar.e(new rc("active_alert_type", 1, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("active_alert_value", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(2).f20460i.add(new pw("active_alert_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(2).f20460i.get(0).b(1, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("active_alert_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(2).f20460i.get(1).b(1, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("active_alert_calories", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "calories"));
        bkVar.f19753c.get(2).f20460i.get(2).b(1, 2L);
        bkVar.e(new rc("rest_alert_type", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rest_alert_value", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(4).f20460i.add(new pw("rest_alert_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(4).f20460i.get(0).b(3, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("rest_alert_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(4).f20460i.get(1).b(3, 1L);
        bkVar.f19753c.get(4).f20460i.add(new pw("rest_alert_calories", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "calories"));
        bkVar.f19753c.get(4).f20460i.get(2).b(3, 2L);
        bkVar.e(new rc("enabled", 5, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("active_alert_mesg", 6, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("rest_alert_mesg", 7, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public my() {
        super(wb.b(74));
    }

    public my(bk bkVar) {
        super(bkVar);
    }
}
