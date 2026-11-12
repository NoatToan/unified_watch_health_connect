package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20195e;

    static {
        bk bkVar = new bk("roster_header", 234);
        f20195e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("num_batter_profiles", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("num_bat_profiles", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_sync_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hq() {
        super(wb.b(234));
    }

    public hq(bk bkVar) {
        super(bkVar);
    }
}
