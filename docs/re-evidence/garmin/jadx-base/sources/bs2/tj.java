package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class tj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20578e;

    static {
        bk bkVar = new bk("memo_glob", 145);
        f20578e = bkVar;
        bkVar.e(new rc("part_index", 250, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("mesg_num", 1, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("parent_index", 2, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("field_num", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("data", 4, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tj() {
        super(wb.b(145));
    }

    public tj(bk bkVar) {
        super(bkVar);
    }
}
