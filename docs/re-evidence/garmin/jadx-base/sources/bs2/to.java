package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class to extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20580e;

    static {
        bk bkVar = new bk("rally_x10_cycle_event_data", 457);
        f20580e = bkVar;
        bkVar.e(new rc("timestamp_32k", 0, 143, 32768.0d, 0.0d, "s", false, zn.UINT64));
        bkVar.e(new rc("accum_period_s2048", 1, 132, 2048.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("event_power_w", 2, 131, 1.0d, 0.0d, "W", false, znVar));
        bkVar.e(new rc("accum_power_w", 3, 131, 1.0d, 0.0d, "W", false, znVar));
        bkVar.e(new rc("event_torque_n32", 4, 131, 32.0d, 0.0d, "N*m", false, znVar));
        bkVar.e(new rc("accum_torque_n32", 5, 131, 32.0d, 0.0d, "N*m", false, znVar));
        bkVar.e(new rc("event_work_j4", 6, 131, 4.0d, 0.0d, "J", false, znVar));
        bkVar.e(new rc("accum_work_j4", 7, 131, 4.0d, 0.0d, "J", false, znVar));
        bkVar.e(new rc("event_crank_angle_b256", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "lsb", false, zn.UINT32));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("balance_pct", 9, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("cadence_rpm", 10, 2, 1.0d, 0.0d, "rpm", false, znVar2));
        bkVar.e(new rc("event_overflow_flags", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public to() {
        super(wb.b(457));
    }

    public to(bk bkVar) {
        super(bkVar);
    }
}
