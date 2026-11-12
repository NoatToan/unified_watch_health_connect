package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wa extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20641e;

    static {
        bk bkVar = new bk("ete_sync_packet", 493);
        f20641e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("packet_start", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("packet_end", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("hr_mean_ave", 2, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hr_mean_sum_w", 3, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hr_std_a", 4, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hr_std_q", 5, 137, 1.0d, 0.0d, "", false, zn.FLOAT64));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("hr_std_k", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("hr_std_std", 7, 133, 1.0d, 0.0d, "", false, znVar2));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("hr_min", 8, 2, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("estimate_n", 9, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("minimal_hr_daily", 10, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("minimal_hr_daily_div_timestamp_utc", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("minimal_hr_daily_datapoint_count", 12, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("state_recovery_duration_awake", 13, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("state_stress_duration_awake", 14, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("relax_stress_intensity_sum", 15, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("state_stress_recovery_duration_close_to_sleep", 16, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("relax_stress_intensity_sum_close_to_sleep", 17, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("physical_activity_sum_all_day", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wa() {
        super(wb.b(493));
    }

    public wa(bk bkVar) {
        super(bkVar);
    }
}
