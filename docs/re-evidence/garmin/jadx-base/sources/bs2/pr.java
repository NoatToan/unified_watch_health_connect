package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes11.dex */
public class pr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20407e;

    static {
        bk bkVar = new bk("sea_state_data", StatusLine.HTTP_MISDIRECTED_REQUEST);
        f20407e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("wave_height_ft", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000000.0d, 0.0d, "ft", false, znVar));
        bkVar.e(new rc("dominant_freq_hz", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000000.0d, 0.0d, "hz", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pr() {
        super(wb.b(StatusLine.HTTP_MISDIRECTED_REQUEST));
    }

    public pr(bk bkVar) {
        super(bkVar);
    }
}
