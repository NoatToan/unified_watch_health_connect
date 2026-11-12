package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ai extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19679e;

    static {
        bk bkVar = new bk("imu_sample_data", 448);
        f19679e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("timestamp_ms", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("accel", 2, 131, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("gyro", 3, 131, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("mag", 4, 131, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ai() {
        super(wb.b(448));
    }

    public ai(bk bkVar) {
        super(bkVar);
    }
}
