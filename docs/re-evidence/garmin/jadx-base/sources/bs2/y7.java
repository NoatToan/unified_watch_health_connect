package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class y7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20683e;

    static {
        bk bkVar = new bk("dive_apnea_alarm", 393);
        f20683e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("depth", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("time", 1, 133, 1.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.BOOL;
        bkVar.e(new rc("enabled", 2, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("alarm_type", 3, 0, 1.0d, 0.0d, "", false, zn.DIVE_ALARM_TYPE));
        bkVar.e(new rc("sound", 4, 0, 1.0d, 0.0d, "", false, zn.TONE));
        bkVar.e(new rc("dive_types", 5, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("popup_enabled", 7, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("trigger_on_descent", 8, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("trigger_on_ascent", 9, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("repeating", 10, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("speed", 11, 133, 1000.0d, 0.0d, "mps", false, znVar2));
        bkVar.e(new rc("last", 12, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("intensity", 13, 0, 1.0d, 0.0d, "", false, zn.INTENSITY));
        bkVar.e(new rc("alert_message", 14, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y7() {
        super(wb.b(393));
    }

    public y7(bk bkVar) {
        super(bkVar);
    }
}
