package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class g20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20151e;

    static {
        bk bkVar = new bk("weight_scale", 30);
        f20151e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("weight", 0, 132, 100.0d, 0.0d, "kg", false, zn.WEIGHT));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("percent_fat", 1, 132, 100.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("percent_hydration", 2, 132, 100.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("visceral_fat_mass", 3, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("bone_mass", 4, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("muscle_mass", 5, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("basal_met", 7, 132, 4.0d, 0.0d, "kcal/day", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("physique_rating", 8, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("active_met", 9, 132, 4.0d, 0.0d, "kcal/day", false, znVar));
        bkVar.e(new rc("metabolic_age", 10, 2, 1.0d, 0.0d, "years", false, znVar2));
        bkVar.e(new rc("visceral_fat_rating", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("user_profile_index", 12, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("bmi", 13, 132, 10.0d, 0.0d, "kg/m^2", false, znVar));
        bkVar.e(new rc("raw_impedance", 14, 132, 1.0d, 0.0d, "ohms", false, znVar));
        bkVar.e(new rc("device_measured_percent_fat", 15, 132, 100.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("device_measured_bone_mass", 16, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("device_measured_muscle_mass", 17, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g20() {
        super(wb.b(30));
    }

    public g20(bk bkVar) {
        super(bkVar);
    }
}
