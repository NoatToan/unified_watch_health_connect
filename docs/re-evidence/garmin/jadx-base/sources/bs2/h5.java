package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class h5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20176e;

    static {
        bk bkVar = new bk("chrono_shot_data", 388);
        f20176e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("shot_speed", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, zn.UINT32));
        bkVar.e(new rc("shot_num", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public h5() {
        super(wb.b(388));
    }

    public h5(bk bkVar) {
        super(bkVar);
    }
}
