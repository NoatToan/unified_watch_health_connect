package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20202e;

    static {
        bk bkVar = new bk("tank_summary", 323);
        f20202e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("sensor", 0, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("start_pressure", 1, 132, 100.0d, 0.0d, "bar", false, znVar));
        bkVar.e(new rc("end_pressure", 2, 132, 100.0d, 0.0d, "bar", false, znVar));
        bkVar.e(new rc("volume_used", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "L", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hx() {
        super(wb.b(323));
    }

    public hx(bk bkVar) {
        super(bkVar);
    }
}
