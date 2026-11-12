package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ut extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20603e;

    static {
        bk bkVar = new bk("sleep_schedule_settings", 379);
        f20603e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.LOCALTIME_INTO_DAY;
        bkVar.e(new rc("fixed_sleep_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fixed_wake_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ut() {
        super(wb.b(379));
    }

    public ut(bk bkVar) {
        super(bkVar);
    }
}
