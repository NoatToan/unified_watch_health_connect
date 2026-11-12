package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class md extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20310e;

    static {
        bk bkVar = new bk("firstbeat_metadata", 288);
        f20310e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.SINT8;
        bkVar.e(new rc("temperature", 0, 1, 1.0d, 0.0d, "C", false, znVar));
        bkVar.e(new rc("humidity", 1, 1, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("weather_report_age", 2, 132, 1.0d, 0.0d, "minutes", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public md() {
        super(wb.b(288));
    }

    public md(bk bkVar) {
        super(bkVar);
    }
}
