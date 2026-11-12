package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class h6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20177e;

    static {
        bk bkVar = new bk("cycling_ability", 494);
        f20177e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("aerobic_endurance", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("aerobic_capacity", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("anaerobic_capacity", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("profile_type", 3, 0, 1.0d, 0.0d, "", false, zn.CYCLING_USER_PROFILE));
        bkVar.e(new rc("profile_type_feedback", 4, 0, 1.0d, 0.0d, "", false, zn.CYCLING_USER_PROFILE_FEEDBACK));
        bkVar.e(new rc("aerobic_endurance_feedback", 5, 0, 1.0d, 0.0d, "", false, zn.CYCLING_USER_AEROBIC_ENDURANCE_FEEDBACK));
        bkVar.e(new rc("aerobic_capacity_feedback", 6, 0, 1.0d, 0.0d, "", false, zn.CYCLING_USER_AEROBIC_CAPACITY_FEEDBACK));
        bkVar.e(new rc("anaerobic_capacity_feedback", 7, 0, 1.0d, 0.0d, "", false, zn.CYCLING_USER_ANAEROBIC_CAPACITY_FEEDBACK));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public h6() {
        super(wb.b(494));
    }

    public h6(bk bkVar) {
        super(bkVar);
    }
}
