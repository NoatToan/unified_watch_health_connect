package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20129e;

    static {
        bk bkVar = new bk("fbt_lha_max_hr_data", 430);
        f20129e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("estimate_generic", 0, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("estimate_cycling", 1, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("variance_generic", 2, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("variance_cycling", 3, 133, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("timestamp_days_generic", 4, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("timestamp_days_cycling", 5, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("last_applied_timestamp", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("estimate_generic_filtered", 7, 2, 1.0d, 0.0d, "bpm", false, znVar4));
        bkVar.e(new rc("estimate_cycling_filtered", 8, 2, 1.0d, 0.0d, "bpm", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fc() {
        super(wb.b(430));
    }

    public fc(bk bkVar) {
        super(bkVar);
    }
}
