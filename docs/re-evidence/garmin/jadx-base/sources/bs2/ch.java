package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ch extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19781e;

    static {
        bk bkVar = new bk("hsa_body_battery_data", 314);
        f19781e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("level", 1, 1, 1.0d, 0.0d, "percent", false, zn.SINT8));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("charged", 2, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("uncharged", 3, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ch() {
        super(wb.b(314));
    }

    public ch(bk bkVar) {
        super(bkVar);
    }
}
