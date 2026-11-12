package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class rr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20467e;

    static {
        bk bkVar = new bk("segment_file", 151);
        f20467e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("file_uuid", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("enabled", 3, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("user_profile_primary_key", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("leader_type", 7, 0, 1.0d, 0.0d, "", false, zn.SEGMENT_LEADERBOARD_TYPE));
        bkVar.e(new rc("leader_group_primary_key", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("leader_activity_id", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("leader_activity_id_string", 10, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("default_race_leader", 11, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("default_race_leader_type", 12, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rr() {
        super(wb.b(151));
    }

    public rr(bk bkVar) {
        super(bkVar);
    }
}
