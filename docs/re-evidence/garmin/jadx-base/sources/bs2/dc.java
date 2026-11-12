package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20052e;

    static {
        bk bkVar = new bk("fbt_lha_jet_lag", 390);
        f20052e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_call_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("last_body_clock_difference", 1, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_time_zone_offset", 2, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_recommended_sleep_time_start_utc", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_recommended_sleep_time_start_tz_ofst", 4, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_recommended_sleep_time_end_utc", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_recommended_sleep_time_end_tz_ofst", 6, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_last_recommended_sleep_time_start_utc", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_last_recommended_sleep_time_start_tz_ofst", 8, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("last_last_recommended_sleep_time_end_utc", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_last_recommended_sleep_time_end_tz_ofst", 10, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dc() {
        super(wb.b(390));
    }

    public dc(bk bkVar) {
        super(bkVar);
    }
}
