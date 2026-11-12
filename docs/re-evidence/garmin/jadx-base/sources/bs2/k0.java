package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class k0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20248e;

    static {
        bk bkVar = new bk("afe_sample_ext_data", 451);
        f20248e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("timestamp_ms", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("afe", 2, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("excitation", 3, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("temp", 4, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k0() {
        super(wb.b(451));
    }

    public k0(bk bkVar) {
        super(bkVar);
    }
}
