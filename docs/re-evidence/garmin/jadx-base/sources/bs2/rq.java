package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class rq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20466e;

    static {
        bk bkVar = new bk("running_dynamics", 175);
        f20466e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("realtime_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("realtime_fractional_timestamp", 2, 132, 32768.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("cadence", 3, 2, 1.0d, 0.0d, "rpm", false, znVar3));
        bkVar.e(new rc("fractional_cadence", 4, 2, 128.0d, 0.0d, "rpm", false, znVar3));
        bkVar.e(new rc("stance_time_percent", 5, 132, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("stance_time", 6, 132, 10.0d, 0.0d, "ms", false, znVar2));
        bkVar.e(new rc("vertical_oscillation", 7, 132, 10.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("ant_speed", 8, 132, 256.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("vertical_ratio", 9, 132, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("step_length", 10, 132, 10.0d, 0.0d, "mm", false, znVar2));
        bkVar.e(new rc("stance_time_balance", 11, 132, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("step_speed_loss", 12, 132, 100.0d, 0.0d, "cm/s", false, znVar2));
        bkVar.e(new rc("step_speed_loss_percent", 13, 132, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rq() {
        super(wb.b(175));
    }

    public rq(bk bkVar) {
        super(bkVar);
    }
}
