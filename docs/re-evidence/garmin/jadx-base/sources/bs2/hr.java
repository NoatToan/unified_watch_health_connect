package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class hr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20196e;

    static {
        bk bkVar = new bk("school_mode_settings", 342);
        f20196e = bkVar;
        zn znVar = zn.LOCALTIME_INTO_DAY;
        bkVar.e(new rc(TtmlNode.START, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(TtmlNode.END, 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("days", 2, 140, 1.0d, 0.0d, "", false, zn.DAY_OF_WEEK_BITS));
        bkVar.e(new rc("mode", 3, 0, 1.0d, 0.0d, "", false, zn.SCHOOL_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hr() {
        super(wb.b(342));
    }

    public hr(bk bkVar) {
        super(bkVar);
    }
}
