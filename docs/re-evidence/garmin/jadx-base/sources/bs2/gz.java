package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20172e;

    static {
        bk bkVar = new bk("tsb_file_correlation", 362);
        f20172e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("activity_file_creator_serial", 0, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("activity_start_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gz() {
        super(wb.b(362));
    }

    public gz(bk bkVar) {
        super(bkVar);
    }
}
