package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class b5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19687e;

    static {
        bk bkVar = new bk("capabilities", 1);
        f19687e = bkVar;
        bkVar.e(new rc("languages", 0, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("sports", 1, 10, 1.0d, 0.0d, "", false, zn.SPORT_BITS_0));
        bkVar.e(new rc("workouts_supported", 21, 140, 1.0d, 0.0d, "", false, zn.WORKOUT_CAPABILITIES));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("activity_profile_supported", 22, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("connectivity_supported", 23, 140, 1.0d, 0.0d, "", false, zn.CONNECTIVITY_CAPABILITIES));
        bkVar.e(new rc("wifi_supported", 24, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("segments_supported", 25, 140, 1.0d, 0.0d, "", false, zn.SEGMENT_CAPABILITIES));
        bkVar.e(new rc("audio_prompts_supported", 26, 140, 1.0d, 0.0d, "", false, zn.AUDIO_PROMPT_CAPABILITIES));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public b5() {
        super(wb.b(1));
    }

    public b5(bk bkVar) {
        super(bkVar);
    }
}
