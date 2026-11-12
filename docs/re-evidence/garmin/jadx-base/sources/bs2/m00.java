package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class m00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20292e;

    static {
        bk bkVar = new bk("vector3_inter_cal", 255);
        f20292e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("force", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 16.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("pco", 1, 131, 16.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("temperature", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("num_points", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("strain_offset", 4, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex_offset", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("flexure_align", 6, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("strain_mag", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m00() {
        super(wb.b(255));
    }

    public m00(bk bkVar) {
        super(bkVar);
    }
}
