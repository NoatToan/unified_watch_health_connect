package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class tx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20588e;

    static {
        bk bkVar = new bk("timestamp_correlation", 162);
        f20588e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("system_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("fractional_system_timestamp", 2, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("local_timestamp", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("timestamp_ms", 4, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("system_timestamp_ms", 5, 132, 1.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tx() {
        super(wb.b(162));
    }

    public tx(bk bkVar) {
        super(bkVar);
    }
}
