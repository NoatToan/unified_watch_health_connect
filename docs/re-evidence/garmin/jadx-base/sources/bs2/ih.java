package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ih extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20215e;

    static {
        bk bkVar = new bk("hsa_gyroscope_data", 376);
        f20215e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("sampling_interval", 1, 132, 1.0d, 0.0d, "1/32768 s", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("gyro_x", 2, 131, 28.57143d, 0.0d, "deg/s", false, znVar2));
        bkVar.e(new rc("gyro_y", 3, 131, 28.57143d, 0.0d, "deg/s", false, znVar2));
        bkVar.e(new rc("gyro_z", 4, 131, 28.57143d, 0.0d, "deg/s", false, znVar2));
        bkVar.e(new rc("timestamp_32k", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "1/32768 s", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ih() {
        super(wb.b(376));
    }

    public ih(bk bkVar) {
        super(bkVar);
    }
}
