package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class em extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20083e;

    static {
        bk bkVar = new bk("next_workout_input", 330);
        f20083e = bkVar;
        bkVar.e(new rc("source", 0, 0, 1.0d, 0.0d, "", false, zn.NEXT_WORKOUT_INPUT_SRC));
        bkVar.e(new rc("timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("value", 2, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("local_timestamp", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public em() {
        super(wb.b(330));
    }

    public em(bk bkVar) {
        super(bkVar);
    }
}
