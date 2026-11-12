package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20677e;

    static {
        bk bkVar = new bk("sporting_event_update", 359);
        f20677e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("event_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("update_operation", 1, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_UPDATE_OPERATION));
        bkVar.e(new rc("referenced_file_id", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xv() {
        super(wb.b(359));
    }

    public xv(bk bkVar) {
        super(bkVar);
    }
}
