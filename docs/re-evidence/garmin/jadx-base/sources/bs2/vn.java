package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20625e;

    static {
        bk bkVar = new bk("pr_event", 113);
        f20625e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("category", 0, 132, 1.0d, 0.0d, "", false, zn.PERSONAL_RECORD));
        bkVar.e(new rc("sport", 1, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("duration", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(3).f20460i.add(new pw("duration_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(3).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(3).f20460i.add(new pw("duration_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(3).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(3).f20460i.get(1).b(0, 2L);
        bkVar.f19753c.get(3).f20460i.get(1).b(0, 3L);
        bkVar.e(new rc("result", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(4).f20460i.add(new pw("result_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(4).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(4).f20460i.add(new pw("result_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(4).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(4).f20460i.add(new pw("result_ascent", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "m"));
        bkVar.f19753c.get(4).f20460i.get(2).b(0, 2L);
        bkVar.f19753c.get(4).f20460i.add(new pw("result_power", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "watts"));
        bkVar.f19753c.get(4).f20460i.get(3).b(0, 3L);
        bkVar.f19753c.get(4).f20460i.get(3).b(0, 4L);
        bkVar.e(new rc("start_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("new_record", 5, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vn() {
        super(wb.b(113));
    }

    public vn(bk bkVar) {
        super(bkVar);
    }
}
