package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fo extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20138e;

    static {
        bk bkVar = new bk("qzss_slas_data", 425);
        f20138e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("prn_and_stable_time", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20459h.add(new vc(3, false, 3, 1.0d, 0.0d));
        bkVar.f19753c.get(2).f20459h.add(new vc(4, false, 5, 1.0d, 0.0d));
        bkVar.e(new rc("current_l1s_snr", 1, 2, 4.0d, 0.0d, "dBHz", false, znVar));
        bkVar.e(new rc("max_snr_from_all_qzss", 2, 2, 4.0d, 0.0d, "dBHz", false, znVar));
        bkVar.e(new rc("slas_prn", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("snr_stable_seconds", 4, 2, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fo() {
        super(wb.b(425));
    }

    public fo(bk bkVar) {
        super(bkVar);
    }
}
