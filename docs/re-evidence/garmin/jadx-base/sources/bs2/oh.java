package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes11.dex */
public class oh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20380e;

    static {
        bk bkVar = new bk("hsa_respiration_data", StatusLine.HTTP_TEMP_REDIRECT);
        f20380e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("respiration_rate", 1, 131, 100.0d, 0.0d, "breaths/min", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public oh() {
        super(wb.b(StatusLine.HTTP_TEMP_REDIRECT));
    }

    public oh(bk bkVar) {
        super(bkVar);
    }
}
