package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: classes11.dex */
public class fr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20141e;

    static {
        bk bkVar = new bk("schedule_result", 267);
        f20141e = bkVar;
        bkVar.e(new rc(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("grade", 1, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("training_plan_index", 2, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fr() {
        super(wb.b(267));
    }

    public fr(bk bkVar) {
        super(bkVar);
    }
}
