package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class tr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20583e;

    static {
        bk bkVar = new bk("segment_id", 148);
        f20583e = bkVar;
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("uuid", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport", 2, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("enabled", 3, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("user_profile_primary_key", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("device_id", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("default_race_leader", 6, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("delete_status", 7, 0, 1.0d, 0.0d, "", false, zn.SEGMENT_DELETE_STATUS));
        bkVar.e(new rc("selection_type", 8, 0, 1.0d, 0.0d, "", false, zn.SEGMENT_SELECTION_TYPE));
        bkVar.e(new rc("default_race_leader_type", 9, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tr() {
        super(wb.b(148));
    }

    public tr(bk bkVar) {
        super(bkVar);
    }
}
