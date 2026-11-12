package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class u10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20590e;

    static {
        bk bkVar = new bk("voice_user_behavior", 374);
        f20590e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("voice_assistant_count", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("incoming_bluetooth_call_count", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("outgoing_bluetooth_call_count", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public u10() {
        super(wb.b(374));
    }

    public u10(bk bkVar) {
        super(bkVar);
    }
}
