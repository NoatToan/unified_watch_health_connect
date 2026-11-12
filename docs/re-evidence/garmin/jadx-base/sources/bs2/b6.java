package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class b6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19688e;

    static {
        bk bkVar = new bk("course_point", 32);
        f19688e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("distance", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 5, 0, 1.0d, 0.0d, "", false, zn.COURSE_POINT));
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("name", 6, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("uuid", 7, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("favorite", 8, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("symbol", 9, 132, 1.0d, 0.0d, "", false, zn.LOCATION_SYMBOL));
        bkVar.e(new rc("routing_mode", 10, 0, 1.0d, 0.0d, "", false, zn.ROUTING_MODE));
        bkVar.e(new rc(Constants.ScionAnalytics.PARAM_LABEL, 11, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("data", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("cutoff_offset", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("note", 14, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("rest_duration", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.f19753c.get(15).f20460i.add(new pw("roundabout_exit", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 60L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 61L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 62L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 63L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 64L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 65L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 66L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 67L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 68L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 69L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 70L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 71L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 72L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 73L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 74L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 75L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 76L);
        bkVar.f19753c.get(15).f20460i.get(0).b(5, 77L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public b6() {
        super(wb.b(32));
    }

    public b6(bk bkVar) {
        super(bkVar);
    }
}
