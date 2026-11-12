package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class os extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20385e;

    static {
        bk bkVar = new bk("settings_change", 217);
        f20385e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("message_number", 0, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("message_idx", 1, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("field_number", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("field_idx", 3, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("data", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("string", 5, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("sport", 6, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 7, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("profile_index", 8, 2, 1.0d, 0.0d, "", false, zn.ACTIVITY_PROFILE_INDEX));
        bkVar.e(new rc("change_type", 9, 0, 1.0d, 0.0d, "", false, zn.SETTINGS_CHANGE_TYPE));
        bkVar.e(new rc("change_id_upper", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("change_id_lower", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public os() {
        super(wb.b(217));
    }

    public os(bk bkVar) {
        super(bkVar);
    }
}
