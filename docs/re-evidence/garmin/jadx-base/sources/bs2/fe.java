package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fe extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20131e;

    static {
        bk bkVar = new bk("glucose_summary", 65);
        f20131e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("period", 0, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_PERIOD));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("duration", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("hourly_duration", 132, 1.0d, 0.0d, "hours"));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("daily_duration", 132, 1.0d, 0.0d, "days"));
        bkVar.f19753c.get(2).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("weekly_duration", 132, 1.0d, 0.0d, "weeks"));
        bkVar.f19753c.get(2).f20460i.get(2).b(0, 2L);
        bkVar.f19753c.get(2).f20460i.add(new pw("monthly_duration", 132, 1.0d, 0.0d, "months"));
        bkVar.f19753c.get(2).f20460i.get(3).b(0, 3L);
        bkVar.e(new rc("concentration", 2, 132, 1.0d, 0.0d, "mg/dL", false, znVar));
        bkVar.e(new rc("carb_intake", 3, 132, 1.0d, 0.0d, "calories", false, znVar));
        bkVar.e(new rc("calorie_expenditure", 4, 132, 1.0d, 0.0d, "calories", false, znVar));
        bkVar.e(new rc("medication_rapid", 5, 132, 1.0d, 0.0d, "units", false, znVar));
        bkVar.e(new rc("medication_short", 6, 132, 1.0d, 0.0d, "units", false, znVar));
        bkVar.e(new rc("medication_intermed", 7, 132, 1.0d, 0.0d, "units", false, znVar));
        bkVar.e(new rc("medication_long", 8, 132, 1.0d, 0.0d, "units", false, znVar));
        bkVar.e(new rc("medication_mix", 9, 132, 1.0d, 0.0d, "units", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fe() {
        super(wb.b(65));
    }

    public fe(bk bkVar) {
        super(bkVar);
    }
}
