package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class n3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20324e;

    static {
        bk bkVar = new bk("ble_data", 245);
        f20324e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("inst_id", 1, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("data_length", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("data", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("packet_id", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("num_ext_packets", 5, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public n3() {
        super(wb.b(245));
    }

    public n3(bk bkVar) {
        super(bkVar);
    }
}
