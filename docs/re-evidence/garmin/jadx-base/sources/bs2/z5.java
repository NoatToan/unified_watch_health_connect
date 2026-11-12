package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class z5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20710e;

    static {
        bk bkVar = new bk("course", 31);
        f20710e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("sport", 4, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 5, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("capabilities", 6, 140, 1.0d, 0.0d, "", false, zn.COURSE_CAPABILITIES));
        bkVar.e(new rc("sub_sport", 7, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("trails_id", 8, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cutoff_offset", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, zn.UINT32));
        bkVar.e(new rc("start_note", 10, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("end_note", 11, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public z5() {
        super(wb.b(31));
    }

    public z5(bk bkVar) {
        super(bkVar);
    }
}
