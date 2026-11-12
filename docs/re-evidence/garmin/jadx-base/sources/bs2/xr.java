package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: classes11.dex */
public class xr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20674e;

    static {
        bk bkVar = new bk("segment_leaderboard_entry", 149);
        f20674e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.SEGMENT_LEADERBOARD_TYPE));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("group_primary_key", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("segment_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("activity_id_string", 5, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xr() {
        super(wb.b(149));
    }

    public xr(bk bkVar) {
        super(bkVar);
    }
}
