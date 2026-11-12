package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class zx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21030e;

    static {
        bk bkVar = new bk("totals", 33);
        f21030e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("timer_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("distance", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("calories", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "kcal", false, znVar2));
        bkVar.e(new rc("sport", 3, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("elapsed_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("sessions", 5, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("active_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("sport_profile_index", 7, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("cycles", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 2.0d, 0.0d, "cycles", false, znVar2));
        bkVar.f19753c.get(10).f20460i.add(new pw("steps", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps"));
        bkVar.f19753c.get(10).f20460i.get(0).b(3, 11L);
        bkVar.f19753c.get(10).f20460i.get(0).b(3, 1L);
        bkVar.f19753c.get(10).f20460i.add(new pw("strokes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 2.0d, 0.0d, "strokes"));
        bkVar.f19753c.get(10).f20460i.get(1).b(3, 2L);
        bkVar.f19753c.get(10).f20460i.get(1).b(3, 5L);
        bkVar.e(new rc("sport_index", 9, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sport_profile_name", 10, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("last_reset_time", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zx() {
        super(wb.b(33));
    }

    public zx(bk bkVar) {
        super(bkVar);
    }
}
