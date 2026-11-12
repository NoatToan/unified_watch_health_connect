package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class pp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20405e;

    static {
        bk bkVar = new bk("rally_x10_temperature", 446);
        f20405e = bkVar;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, zn.UINT32));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("cpu_temp", 1, 131, 256.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("imu_temp", 2, 131, 256.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("afe_temp", 3, 131, 256.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("pmic_temp", 4, 131, 256.0d, 0.0d, "degrees C", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pp() {
        super(wb.b(446));
    }

    public pp(bk bkVar) {
        super(bkVar);
    }
}
