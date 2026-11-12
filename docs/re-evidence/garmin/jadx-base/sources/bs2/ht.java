package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ht extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20198e;

    static {
        bk bkVar = new bk("sleep_assessment", 346);
        f20198e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("combined_awake_score", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("awake_time_score", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("awakenings_count_score", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("deep_sleep_score", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_duration_score", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("light_sleep_score", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("overall_sleep_score", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_quality_score", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_recovery_score", 8, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rem_sleep_score", 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sleep_restlessness_score", 10, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("awakenings_count", 11, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("feedback", 12, 0, 1.0d, 0.0d, "", false, zn.SLEEP_ASSESSMENT_FEEDBACK));
        bkVar.e(new rc("insight", 13, 0, 1.0d, 0.0d, "", false, zn.SLEEP_ASSESSMENT_INSIGHT));
        bkVar.e(new rc("interruptions_score", 14, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("average_stress_during_sleep", 15, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("personalized_insight", 16, 0, 1.0d, 0.0d, "", false, zn.SLEEP_ASSESSMENT_PERSONALIZED_INSIGHT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ht() {
        super(wb.b(346));
    }

    public ht(bk bkVar) {
        super(bkVar);
    }
}
