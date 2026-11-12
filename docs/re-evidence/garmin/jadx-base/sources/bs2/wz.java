package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20655e;

    static {
        bk bkVar = new bk("ui_question", 66);
        f20655e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("text", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.QUESTION));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("min", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("max", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("units", 4, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("decimals", 5, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("response_option_group", 6, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("response_bar_graph_group", 7, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wz() {
        super(wb.b(66));
    }

    public wz(bk bkVar) {
        super(bkVar);
    }
}
