package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class o9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20374e;

    static {
        bk bkVar = new bk("eqn_app_information", 504);
        f20374e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("app_platform", 0, 0, 1.0d, 0.0d, "", false, zn.EQN_APP_PLATFORM_TYPES));
        bkVar.e(new rc("app_version_num", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o9() {
        super(wb.b(504));
    }

    public o9(bk bkVar) {
        super(bkVar);
    }
}
