package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class je extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20232e;

    static {
        bk bkVar = new bk("gnss_config", 327);
        f20232e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("baud_rate", 0, 2, 1.0d, 0.0d, "enum", false, znVar));
        bkVar.e(new rc("fix_rate", 1, 2, 1.0d, 0.0d, "enum", false, znVar));
        bkVar.e(new rc("nav_mode", 2, 2, 1.0d, 0.0d, "enum", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("hotfix_mode_bf", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bf", false, znVar2));
        bkVar.e(new rc("packet_config_bf", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bf", false, znVar2));
        bkVar.e(new rc("misc_config_bf", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "bf", false, znVar2));
        bkVar.e(new rc("pps_enable", 6, 0, 1.0d, 0.0d, "bool", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public je() {
        super(wb.b(327));
    }

    public je(bk bkVar) {
        super(bkVar);
    }
}
