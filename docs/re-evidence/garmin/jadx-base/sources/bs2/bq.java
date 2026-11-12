package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class bq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19757e;

    static {
        bk bkVar = new bk("recovery_time", 284);
        f19757e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("recovery_time_minutes", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("recovery_time_start", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("recovery_time_change_based_on_physical_activity", 2, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("recovery_time_change_based_on_sleep", 3, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("recovery_time_change_based_on_stress_and_recovery", 4, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("recovery_time_change_phrase", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(5).f20459h.add(new vc(6, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("recovery_time_change_phrase_type", 6, 0, 1.0d, 0.0d, "", false, zn.RECOVERY_TIME_CHANGE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bq() {
        super(wb.b(284));
    }

    public bq(bk bkVar) {
        super(bkVar);
    }
}
