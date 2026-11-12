package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20278e;

    static {
        bk bkVar = new bk("fbt_lha_osw_data", 507);
        f20278e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("sleep_need_baseline", 0, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_window_start", 1, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_window_end", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("feedback", 3, 0, 1.0d, 0.0d, "", false, zn.OPTIMAL_SLEEP_WINDOW_FEEDBACK));
        bkVar.e(new rc("result_update_timestamp", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("result_update_tz_offset", 5, 131, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("data_update_timestamp", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("data_update_tz_offset", 7, 131, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("clocktime_ewma", 8, 132, 1.0d, 0.0d, "", false, znVar2));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("clocktime_ewc", 9, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("result_ideal_sleep_window_midpoint", 10, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("result_previous_night_sleep_midpoint", 11, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("previous_output_source", 12, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("time_id_start_date", 13, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lc() {
        super(wb.b(507));
    }

    public lc(bk bkVar) {
        super(bkVar);
    }
}
