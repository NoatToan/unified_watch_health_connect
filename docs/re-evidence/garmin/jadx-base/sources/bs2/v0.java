package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class v0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20607e;

    static {
        bk bkVar = new bk("ant_generic_debug", 324);
        f20607e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("device_index", 1, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public v0() {
        super(wb.b(324));
    }

    public v0(bk bkVar) {
        super(bkVar);
    }
}
