package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class d6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20050e;

    static {
        bk bkVar = new bk("csv_data", 133);
        f20050e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("col_index", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("col_value", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("fractional_timestamp", 2, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public d6() {
        super(wb.b(133));
    }

    public d6(bk bkVar) {
        super(bkVar);
    }
}
