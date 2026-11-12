package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.roomorama.caldroid.CaldroidFragment;

/* JADX INFO: loaded from: classes11.dex */
public class ea extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20077e;

    static {
        bk bkVar = new bk("eqn_horse_profile", 474);
        f20077e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("local_horse_uuid", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("friendly_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("height", 2, 132, 10.0d, 0.0d, "hands", false, znVar2));
        bkVar.e(new rc("weight", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 10.0d, 0.0d, "kgs", false, zn.UINT32));
        bkVar.e(new rc("birth_year", 4, 2, 1.0d, -1900.0d, CaldroidFragment.YEAR, false, znVar));
        bkVar.e(new rc("birth_month", 5, 2, 1.0d, 0.0d, CaldroidFragment.MONTH, false, znVar));
        bkVar.e(new rc("birth_day", 6, 2, 1.0d, 0.0d, "date", false, znVar));
        bkVar.e(new rc("gender", 7, 0, 1.0d, 0.0d, "", false, zn.EQN_HORSE_GENDER));
        bkVar.e(new rc("riding_type", 8, 0, 1.0d, 0.0d, "", false, zn.EQN_HORSE_RIDING_TYPE));
        bkVar.e(new rc("maximum_heart_rate", 9, 132, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("recovery_heart_rate", 10, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("recovery_time", 11, 132, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ea() {
        super(wb.b(474));
    }

    public ea(bk bkVar) {
        super(bkVar);
    }
}
