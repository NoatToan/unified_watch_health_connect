package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes11.dex */
public class kh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20261e;

    static {
        bk bkVar = new bk("hsa_heart_rate_data", StatusLine.HTTP_PERM_REDIRECT);
        f20261e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("status", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("heart_rate", 2, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public kh() {
        super(wb.b(StatusLine.HTTP_PERM_REDIRECT));
    }

    public kh(bk bkVar) {
        super(bkVar);
    }
}
