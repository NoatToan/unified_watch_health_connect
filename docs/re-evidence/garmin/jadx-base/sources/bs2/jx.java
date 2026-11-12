package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class jx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20246e;

    static {
        bk bkVar = new bk("tank_update", 319);
        f20246e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("sensor", 0, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        bkVar.e(new rc("pressure", 1, 132, 100.0d, 0.0d, "bar", false, zn.UINT16));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("depth", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("distance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jx() {
        super(wb.b(319));
    }

    public jx(bk bkVar) {
        super(bkVar);
    }
}
