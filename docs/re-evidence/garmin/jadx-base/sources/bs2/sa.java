package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class sa extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20478e;

    static {
        bk bkVar = new bk("eqn_vet_gate_request", 508);
        f20478e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("vet_gate_request", 0, 0, 1.0d, 0.0d, "", false, zn.EQN_VET_GATE_REQUEST_TYPE));
        bkVar.e(new rc("requested_hr", 1, 2, 1.0d, 0.0d, "bpm", false, zn.UINT8));
        bkVar.e(new rc("requested_time", 2, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sa() {
        super(wb.b(508));
    }

    public sa(bk bkVar) {
        super(bkVar);
    }
}
