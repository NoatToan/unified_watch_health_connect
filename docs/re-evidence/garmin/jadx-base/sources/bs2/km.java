package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class km extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20267e;

    static {
        bk bkVar = new bk("ohr_settings", TsExtractor.TS_PACKET_SIZE);
        f20267e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SWITCH;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sample_rate", 1, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("transmit_hr_enabled", 2, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("broadcast_during_activity", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("swim_enabled", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("during_sleep_enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("blended_hrm_enabled", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public km() {
        super(wb.b(TsExtractor.TS_PACKET_SIZE));
    }

    public km(bk bkVar) {
        super(bkVar);
    }
}
