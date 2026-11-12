package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ah extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19678e;

    static {
        bk bkVar = new bk("hsa_accelerometer_data", 302);
        f19678e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sampling_interval", 1, 132, 1.0d, 0.0d, "ms", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("accel_x", 2, 131, 1.024d, 0.0d, "mG", false, znVar2));
        bkVar.e(new rc("accel_y", 3, 131, 1.024d, 0.0d, "mG", false, znVar2));
        bkVar.e(new rc("accel_z", 4, 131, 1.024d, 0.0d, "mG", false, znVar2));
        bkVar.e(new rc("timestamp_32k", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ah() {
        super(wb.b(302));
    }

    public ah(bk bkVar) {
        super(bkVar);
    }
}
