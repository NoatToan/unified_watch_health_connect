package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20249e;

    static {
        bk bkVar = new bk("vector3_cal", TsExtractor.TS_STREAM_TYPE_AIT);
        f20249e = bkVar;
        bkVar.e(new rc("force", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 16.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("temperature", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("handedness", 2, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("strain_offset", 3, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("align", 4, 131, 16384.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("adb_matrix", 5, 131, 32768.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("db_slope", 7, 132, 4096.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("db_offset", 8, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex_offset", 9, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("g_range", 10, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("pedal_weight", 11, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pedal_pco", 12, 131, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("mag", 13, 132, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k00() {
        super(wb.b(TsExtractor.TS_STREAM_TYPE_AIT));
    }

    public k00(bk bkVar) {
        super(bkVar);
    }
}
