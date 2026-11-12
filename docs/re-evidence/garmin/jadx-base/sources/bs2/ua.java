package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ua extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20595e;

    static {
        bk bkVar = new bk("eqn_vet_gate_status", 509);
        f20595e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("vet_gate_status", 0, 0, 1.0d, 0.0d, "", false, zn.EQN_VET_GATE_STATUS_TYPE));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("current_hr", 1, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("current_time", 2, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ua() {
        super(wb.b(509));
    }

    public ua(bk bkVar) {
        super(bkVar);
    }
}
