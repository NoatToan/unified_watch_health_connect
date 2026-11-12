package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20667e;

    static {
        bk bkVar = new bk("gh_partner_data_metadata", 377);
        f20667e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("data_type", 1, 0, 1.0d, 0.0d, "", false, zn.GH_PARTNER_DATA_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xd() {
        super(wb.b(377));
    }

    public xd(bk bkVar) {
        super(bkVar);
    }
}
