package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class en extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20084e;

    static {
        bk bkVar = new bk("personal_record", 114);
        f20084e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("category", 0, 132, 1.0d, 0.0d, "", false, zn.PERSONAL_RECORD));
        bkVar.e(new rc("sport", 1, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("duration", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(4).f20460i.add(new pw("duration_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(4).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("duration_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 2L);
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 3L);
        bkVar.e(new rc("tolerance_min", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(5).f20460i.add(new pw("tolerance_min_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(5).f20460i.get(0).b(0, 0L);
        bkVar.e(new rc("tolerance_max", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(6).f20460i.add(new pw("tolerance_max_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(6).f20460i.get(0).b(0, 0L);
        bkVar.e(new rc("result", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(7).f20460i.add(new pw("result_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(7).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(7).f20460i.add(new pw("result_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(7).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(7).f20460i.add(new pw("result_ascent", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m"));
        bkVar.f19753c.get(7).f20460i.get(2).b(0, 2L);
        bkVar.f19753c.get(7).f20460i.add(new pw("result_power", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(7).f20460i.get(3).b(0, 3L);
        bkVar.e(new rc("flags", 6, 140, 1.0d, 0.0d, "", false, zn.PR_FLAGS));
        bkVar.e(new rc("result_min", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(9).f20460i.add(new pw("result_min_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(9).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(9).f20460i.add(new pw("result_min_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(9).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(9).f20460i.add(new pw("result_min_ascent", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m"));
        bkVar.f19753c.get(9).f20460i.get(2).b(0, 2L);
        bkVar.f19753c.get(9).f20460i.add(new pw("result_min_power", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(9).f20460i.get(3).b(0, 3L);
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public en() {
        super(wb.b(114));
    }

    public en(bk bkVar) {
        super(bkVar);
    }
}
