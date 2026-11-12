package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20650e;

    static {
        bk bkVar = new bk("monitoring_info", 103);
        f20650e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("activity_type", 1, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_TYPE));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("cycles_to_distance", 3, 132, 5000.0d, 0.0d, "m/cycle", false, znVar));
        bkVar.e(new rc("cycles_to_calories", 4, 132, 5000.0d, 0.0d, "kcal/cycle", false, znVar));
        bkVar.e(new rc("resting_metabolic_rate", 5, 132, 1.0d, 0.0d, "kcal / day", false, znVar));
        bkVar.e(new rc("obsolete_cycles_goal", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(6).f20459h.add(new vc(7, false, 16, 2.0d, 0.0d));
        bkVar.f19753c.get(6).f20459h.add(new vc(7, false, 16, 2.0d, 0.0d));
        bkVar.e(new rc("cycles_goal", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 2.0d, 0.0d, "cycles", false, zn.UINT32));
        bkVar.e(new rc("monitoring_time_source", 8, 0, 1.0d, 0.0d, "", false, zn.TIME_SOURCE));
        bkVar.e(new rc("source", 9, 0, 1.0d, 0.0d, "", false, zn.MONITORING_DATA_SOURCE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wk() {
        super(wb.b(103));
    }

    public wk(bk bkVar) {
        super(bkVar);
    }
}
