package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class mf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20311e;

    static {
        bk bkVar = new bk("graph_series", 99);
        f20311e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc(FirebaseAnalytics.Param.INDEX, 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 132, 1.0d, 0.0d, "", false, zn.GRAPH_SERIES_TYPE));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("x_max", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("y_max", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_width", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_start", 5, 133, 1.0d, 0.0d, "", false, zn.SINT32));
        bkVar.e(new rc("x_type", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("y_type", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mf() {
        super(wb.b(99));
    }

    public mf(bk bkVar) {
        super(bkVar);
    }
}
